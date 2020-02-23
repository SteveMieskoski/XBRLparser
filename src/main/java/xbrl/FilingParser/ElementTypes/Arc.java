package xbrl.FilingParser.ElementTypes;

import org.dom4j.Attribute;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Arc {
    public String type;
    public String from;
    public String to;
    public String arcrole;
    public String order;
    public String use;
    public String weight;
    public String priority;
    public Map<String, String> additional = null;

    public String linkBaseRef;

    public Arc(Element element) {
        parseHandler(element);
    }

    public Arc(String linkBaseRef, String type, String arcrole, String from, String to, String order, String use, String weight, String priority) {
        this.linkBaseRef = linkBaseRef;
        this.type = type;
        this.from = from;
        this.to = to;
        this.arcrole = arcrole;
        this.order = order;
        this.use = use;
        this.weight = weight;
        this.priority = priority;
    }

    public void parseHandler(Element element) {
        for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
            Attribute attribute = attrIter.next();
            if (attribute != null) {
                switch (attribute.getName()) {
                    case "type":
                        this.type = attribute.getValue();
                        break;
                    case "from":
                        this.from = attribute.getValue();
                        break;
                    case "to":
                        this.to = attribute.getValue();
                        break;
                    case "arcrole":
                        this.arcrole = attribute.getValue();
                        break;
                    case "order":
                        this.order = attribute.getValue();
                        break;
                    case "use":
                        this.use = attribute.getValue();
                        break;
                    case "weight":
                        this.weight = attribute.getValue();
                        break;
                    case "priority":
                        this.priority = attribute.getValue();
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
        return "\n\tArc{"
                + "type='"
                + type
                + '\''
                + ", from='"
                + from
                + '\''
                + ", to='"
                + to
                + '\''
                + ", arcrole='"
                + arcrole
                + '\''
                + ", order='"
                + order
                + '\''
                + ", use='"
                + use
                + '\''
                + ", weight='"
                + weight
                + '\''
                + ", priority='"
                + priority
                + '\''
                + ", additional="
                + additional
                + '}';
    }
}
