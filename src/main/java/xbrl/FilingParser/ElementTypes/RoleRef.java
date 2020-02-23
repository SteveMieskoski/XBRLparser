package xbrl.FilingParser.ElementTypes;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.*;

public class RoleRef {
    public String type;
    public String href;
    public String schemaDef;
    public String roleRefId;
    public String roleUri;

    public RoleRef() {
    }


    public RoleRef(Element element) {
        parseHandler(element);
    }


    public void parseHandler(Element element) {
        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
            Attribute attribute = attrIter.next();
            if (attribute != null) {
                switch (attribute.getName()) {
                    case "type":
                        this.type = attribute.getValue();
                        break;
                    case "href":
                        this.href = attribute.getValue();
                        String[] parts = this.href.split("#");
                        List<String> partList = Arrays.asList(parts);
                        if(partList.size() == 2){
                            this.schemaDef = partList.get(0);
                            this.roleRefId = partList.get(1);
                        } else {
                            System.out.println("SHOULD HAVE DEFINITION AND ID: " + this.href); // todo remove dev item
                        }
                        break;
                    case "roleURI":
                        this.roleUri = attribute.getValue();
                        break;
                    default:
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nRoleRef{" +
                "type='" + type + '\'' +
                ", href='" + href + '\'' +
                ", schemaSource='" + schemaDef + '\'' +
                ", roleRefId='" + roleRefId + '\'' +
                ", roleUri='" + roleUri + '\'' +
                '}';
    }
}
