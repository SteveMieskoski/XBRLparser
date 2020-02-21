package FilingParser.ElementTypes;

import java.util.HashMap;
import java.util.Map;

public class XmlEntry {
   public String tag;
    public Map<String, String> attributes = new HashMap<>();
    public String text;

    public XmlEntry() {
    }

    public XmlEntry(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttribute(String key, String value) {
        this.attributes.put(key, value);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
