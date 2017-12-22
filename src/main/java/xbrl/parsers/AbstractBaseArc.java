package xbrl.parsers;

import org.dom4j.Element;

import java.util.TreeMap;

public abstract class AbstractBaseArc<T extends AbstractBaseArc> {

    // class to hold the connections, and order (in order)
    public String from;
    public String orderVal;
    public String toVal;
    public TreeMap<Integer, T> to;
    public String href;
    public Boolean value;
    public Integer level;
    public Integer order;
    public Element element;
    public Boolean startNext = false;



    public void addContent(String label, String href){
        if(this.from.equals(label)){
            if(this.to == null){
                this.href = href;
                this.value = true;
            } else {
                for(Integer i: this.to.keySet()){
                    this.to.get(i).addContent(label, href);
                }
            }
        } else {
            for(Integer i: this.to.keySet()){
                this.to.get(i).addContent(label, href);
            }
        }
    }

    public String getOrderVal() {
        return orderVal;
    }

    public void setOrderVal(String orderVal) {
        this.orderVal = orderVal;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public TreeMap<Integer, T> getTo() {
        return to;
    }

    public void setTo(TreeMap<Integer, T> to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "BaseArc{" +
                "from='" + from + '\'' +
                ", orderVal='" + orderVal + '\'' +
                ", toVal='" + toVal + '\'' +
                ", to=" + to +
                ", href='" + href + '\'' +
                ", value=" + value +
                '}';
    }
}


/*
*     public void check(String from, String to, String order){
        if(this.to == null){
            this.to = new TreeMap<>();
            this.orderVal = order;
        }
        if(this.from.equals(from)){
//            for(Integer i: this.hold.keySet()){
//                if(this.hold.get(i).from.equals(from)){
//                    this.holding
//                }
//            }
            this.hold.put(Integer.parseInt(order), new BaseArc(from, order, to));
            this.to.put(Integer.parseInt(order), new BaseArc(to));
        } else {
//            for(Integer i: this.to.keySet()){
//                this.to.get(i).check(from, to, order);
//            }
        }
    }
*
* */