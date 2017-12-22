package xbrl.elementTypes;

import java.util.HashMap;

// todo: Probably can eliminate this interface
public interface IElement {

    // Generally Used
    String getRelatedRole();

    void setRelatedRole(String relatedRole);

    String getElementType();

    void setElementType(String elementType);

    String getTag();

    void setTag(String tag);

    String getValue();

    void setValue(String value);

    // Specific (possible to remove in the future)
    String getCustomPrefix();

    void setCustomPrefix(String customPrefix);

    String getDefaultPrefix();

    void setDefaultPrefix(String defaultPrefix);

    void setAttribute(String name, String value);

    void setHref(String href);

    Integer getIndex();

    void setIndex(Integer index);

    void setLabel(String label);

    String getRoleURI();

    void setRoleURI(String roleURI);

    String getId();

    void setId(String id);

    String getNamespace();

    void setNamespace(String namespace);

    String getHref();

    String getRole();

    void setRole(String role);

    String getType();

    void setType(String type);

    String getFrom();

    void setFrom(String from);

    String getTo();

    void setTo(String to);

    String getTitle();

    void setTitle(String title);

    String getPriority();

    void setPriority(String priority);

    String getSchema();

    void setSchema(String schema);

    String getLabel();

    String getOrder();

    void setOrder(String order);

    String getWeight();

    void setWeight(String weight);

    String getArcrole();

    void setArcrole(String arcrole);

    HashMap<String, String> getProcessedLabels();

    void setProcessedLabels(HashMap<String, String> processedLabels);

    String getLang();

    void setLang(String lang);

}
