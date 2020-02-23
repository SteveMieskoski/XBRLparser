package xbrl.experimentalParsers.extendedLink;

import org.dom4j.Element;
import xbrl.elementTypes.ConstantValues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AggregateArcs {

    public static ArcReturn populateArcList(Element t_roleNode, Map<String, String> tagMap) {

        String[] Arc_From_Values = null;
        String[] Arc_To_Values = null;
        String[] orders = null;
        String[] arcrole = null;
        LinkedList<String> arcList_To = new LinkedList<>();
        LinkedList<Arc> arcList = new LinkedList<>();
        System.out.println("[POPULATE_ArcList]:Extracting arcs");
        if (t_roleNode.elements().size() > 0) {
            // initializing arclist and arcTo list


            // getting the child nodes of this particulat presentation node
            List<Element> nodeList = t_roleNode.elements();

            // extracting only arc(link:presentationArc) nodes from the nodeList
            List<Element> list_ArcNodeList = ExtendedLinkUtils.extractNodes(nodeList, tagMap.get("arc"));

            // extracting xlink:from, xlink:to and order attribute from the list_ArcNodeList..
            Arc_From_Values = ExtendedLinkUtils.extractNodesAttributes(list_ArcNodeList, ConstantValues.from);
            Arc_To_Values = ExtendedLinkUtils.extractNodesAttributes(list_ArcNodeList, ConstantValues.to);
            orders = ExtendedLinkUtils.extractNodesAttributes(list_ArcNodeList, ConstantValues.order);
            arcrole = ExtendedLinkUtils.extractNodesAttributes(list_ArcNodeList, ConstantValues.arcrole);

            System.out.println("Extracted Arc Info:");
            System.out.println("  COUNTS::  Arc_From:" + Arc_From_Values.length);
            System.out.println("            Arc_From:" + Arc_To_Values.length);
            System.out.println("            Order:" + orders.length);
            System.out.println("            Arcrole:" + arcrole.length);

            // creating 'arc' object and inserting 'from' , 'to' ,'order' values.
            for (int i = 0; i < list_ArcNodeList.size(); i++) {
                arcList.add(new Arc(Arc_From_Values[i], Arc_To_Values[i], Float.parseFloat(orders[i]), arcrole[i]));

                // also populate 'arcList_To' arraylist
                arcList_To.add(Arc_To_Values[i]);
            }

            System.out.println("[POPULATE_ArcList]:Completed.List size:" + arcList.size());
            System.out.println("[POPULATE_Arc_To_List]:Completed.List size:" + arcList_To.size());
            return new ArcReturn(arcList_To, arcList);
        } else {
            System.out.println("ERROR[POPULATE_ArcList]:Given Role Node has no childs! ");
            return new ArcReturn(arcList_To, arcList);
        }
    }


    static class ArcReturn{
        public LinkedList<String> arcList_To;
        public LinkedList<Arc> arcList;

        public ArcReturn(LinkedList<String> arcList_To, LinkedList<Arc> arcList) {
            this.arcList_To = arcList_To;
            this.arcList = arcList;
        }
    }
}
