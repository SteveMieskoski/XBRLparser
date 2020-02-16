package FilingParser.ElementTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Context {
    String id;
    String entityIdentifier;
    List<XmlEntry> segments = new ArrayList<>();
    String periodStart;
    String periodEnd = null;
    String scenario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityIdentifier() {
        return entityIdentifier;
    }

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    public List<XmlEntry> getSegments() {
        return segments;
    }

    public void setSegment(XmlEntry segment) {
        this.segments.add(segment);
    }

    public boolean isInstant(){
        return periodEnd == null;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }
}
