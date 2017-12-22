package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import xbrl.elementTypes.ConstantValues;

import java.util.*;
import java.util.stream.Collectors;

public class ExtendedLinkUtils {

    public static  HashMap<String, List<String>> identifyExtendedLinks(Document document) {
        HashMap<String, List<String>> extendedLinkRoles = new HashMap<>();
        List<Element> presentationNodes =
                document.getRootElement().elements(ConstantValues.presentationLink_tag);
        List<String> presentationRoles =
                presentationNodes
                        .stream()
                        .map(element -> element.attributeValue("role"))
                        .collect(Collectors.toList());
        if (presentationRoles.size() > 0) extendedLinkRoles.put("pre", presentationRoles);

        List<Element> definitionNodes =
                document.getRootElement().elements(ConstantValues.definitionLink_tag);
        List<String> definitionRoles =
                definitionNodes
                        .stream()
                        .map(element -> element.attributeValue("role"))
                        .collect(Collectors.toList());
        if (definitionRoles.size() > 0) extendedLinkRoles.put("def", definitionRoles);

        List<Element> labelNodes = document.getRootElement().elements(ConstantValues.labelLink_tag);
        List<String> labelRoles =
                labelNodes
                        .stream()
                        .map(element -> element.attributeValue("role"))
                        .collect(Collectors.toList());
        if (labelRoles.size() > 0) extendedLinkRoles.put("lab", labelRoles);

        List<Element> calculationNodes =
                document.getRootElement().elements(ConstantValues.calculationLink_tag);
        List<String> calculationRoles =
                calculationNodes
                        .stream()
                        .map(element -> element.attributeValue("role"))
                        .collect(Collectors.toList());
        if (calculationRoles.size() > 0) extendedLinkRoles.put("cal", calculationRoles);

        System.out.println(presentationNodes);
        return extendedLinkRoles;
    }

    public static LinkedList<Element> extractNodes(List<Element> nodeList, String nodeToExtract) {
        LinkedList<Element> list_nodeList = new LinkedList<>();
        Element tempNode = null;

        System.out.println("Extracting Node of name  :  " + nodeToExtract);
        System.out.println("-----------------------------");
        for (int i = 0; i < nodeList.size(); i++) {
            tempNode = nodeList.get(i);
            if (tempNode.getName().equals(nodeToExtract)) {
                // add to List<Node>
                list_nodeList.add(tempNode);
            }
        }
        return list_nodeList;
    }

    public static String[] extractNodesAttributes(List<Element> list_nodeList, String attribName) {
        Iterator<Element> itr = list_nodeList.iterator();
        String[] attribValues = new String[list_nodeList.size()];
        int count = 0;

        while (itr.hasNext()) {
            attribValues[count] = itr.next().attributeValue(attribName);
            count++;
        }
        System.out.println("Attribute values Count: " + attribValues.length);

        return attribValues;
    }
}
