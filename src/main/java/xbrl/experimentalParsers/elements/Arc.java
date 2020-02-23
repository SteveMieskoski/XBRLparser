package xbrl.experimentalParsers.elements;

public class Arc {

  private final String from;
  private final String to;
  private final String arcrole;
  private final String type = "arc";
  private String title;
  private String show;
  private String actuate;
  private Double order;
  private String use;
  private Integer priority;

    public Arc(String from, String to, String arcrole) {
        this.from = from;
        this.to = to;
        this.arcrole = arcrole;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getArcrole() {
        return arcrole;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getActuate() {
        return actuate;
    }

    public void setActuate(String actuate) {
        this.actuate = actuate;
    }

    public Double getOrder() {
        return order;
    }

    public void setOrder(Double order) {
        this.order = order;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void print()
    {
        System.out.println( "Arc:" );
        System.out.println( "  from='" + from  );
        System.out.println( " to=" + to);
        System.out.println( " arcrole=" + arcrole);
        System.out.println( " type=" + type);
        System.out.println( " title=" + title);
        System.out.println( " show=" + show);
        System.out.println( " actuate=" + actuate);
        System.out.println( " order=" + order);
        System.out.println( " use=" + use);
        System.out.println( " priority=" + priority);
    }
}
