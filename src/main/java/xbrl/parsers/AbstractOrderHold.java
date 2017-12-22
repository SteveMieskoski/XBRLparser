package xbrl.parsers;

import org.dom4j.Element;

import java.util.UUID;

public abstract class AbstractOrderHold {

    public Integer order;
    public UUID uuid;
    public Element element;
    public Boolean startNext = false;


    public Boolean getStartNext() {
        return startNext;
    }

    public void setStartNext(Boolean startNext) {
        this.startNext = startNext;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "PreOrderHold{" +
                "order=" + order +
                ", uuid=" + uuid +
                ", element=" + element +
                '}';
    }
}
