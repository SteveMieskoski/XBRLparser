package xbrl.elementTypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LabelsContainer {

    public String from;
    public String to;
    public String arcrole;
    public String label;

    private Map<String, LabelElement> relatedLabels;
    private List<String> labelRefs;

    public LabelsContainer() {
    }

    public LabelsContainer(String from, String to, String arcrole) {
        this.from = from;
        this.to = to;
        this.arcrole = arcrole;
        this.relatedLabels = new LinkedHashMap<>();
    }

    public void addRelatedLabel(String key, LabelElement value){
        if(this.relatedLabels == null){
        this.relatedLabels = new LinkedHashMap<>();
        }
        addLabelRef(value.getLabel());
        this.label = value.getLabel();
        this.relatedLabels.put(key, value);
    }

    public void addLabelRef(String value){
        if(this.labelRefs == null){
        this.labelRefs = new ArrayList<>();
        }
        this.labelRefs.add(value);
    }

    public Map<String, LabelElement> getRelatedLabels() {
        return relatedLabels;
    }

    public void setRelatedLabels(Map<String, LabelElement> relatedLabels) {
        this.relatedLabels = relatedLabels;
    }

    @Override
    public String toString() {
        return "LabelsContainer{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", arcrole='" + arcrole + '\'' +
                ", relatedLabels=" + relatedLabels +
                '}';
    }
}
