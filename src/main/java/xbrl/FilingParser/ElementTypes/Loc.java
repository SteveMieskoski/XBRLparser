package xbrl.FilingParser.ElementTypes;


import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.*;

public class Loc {
    public String href;
    public String conceptRaw;
    public String schemaDef;
    public String concept;
    public String prefix;
    public String type;
    public String label;
    public String role; // Optional
    public String title; // Optional
    public Map<String, String> additional = null;

    public String linkBaseRef;

    public Loc(Element element) {
        parseHandler(element);
    }

    public Loc(String linkBaseRef, String type, String href, String label) {
        this.href = href;
        this.type = type;
        this.label = label;
        this.linkBaseRef = linkBaseRef;
    }

    public void parseHandler(Element element) {
        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
            Attribute attribute = attrIter.next();
            if (attribute != null) {
                switch (attribute.getName()) {
                    case "href":
                        this.href = attribute.getValue();
                        String[] parts = this.href.split("#");
                        List<String> partList = Arrays.asList(parts);
                        if(partList.size() == 2){
                            this.schemaDef = partList.get(0);
                            this.conceptRaw = partList.get(1);
                            String[] conceptParts = this.conceptRaw.split("_");
                            List<String> conceptPartsList = Arrays.asList(conceptParts);
                            if(conceptPartsList.size() > 1){
//                                System.out.println(conceptPartsList); // todo remove dev item
                                this.prefix = conceptPartsList.get(0);
                                this.concept = conceptPartsList.get(1);
                            } else {
                                System.out.println("SHOULD HAVE TAXONOMY PREFIX AND CONCEPT LABEL: " + this.href); // todo remove dev item
                            }
                        } else {
                            System.out.println("SHOULD HAVE DEFINITION AND ID: " + this.href); // todo remove dev item
                        }
                        break;
                    case "label":
                        this.label = attribute.getValue();
                        break;
                    case "role":
                        this.role = attribute.getValue();
                        break;
                    case "title":
                        this.title = attribute.getValue();
                        break;
                    case "type":
                        this.type = attribute.getValue();
                        break;
                    default:
                        if (additional == null) {
                            additional = new HashMap<>();
                            additional.put(attribute.getName(), attribute.getValue());
                        }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\n\tLoc{"
                + "href='"
                + href
                + '\''
                + ", label='"
                + label
                + '\''
                + ", role='"
                + role
                + '\''
                + ", title='"
                + title
                + '\''
                + ", additional="
                + additional
                + '}';
    }
}
