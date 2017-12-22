package xbrl.elementTypes;

import xbrl.schemaElementTypes.SchemaElement;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractElement implements IElement {

    public AbstractElement() {
    }

    public AbstractElement(String defaultPrefix) {
        this.defaultPrefix = defaultPrefix;
    }

    public AbstractElement(String customPrefix, String defaultPrefix){
        this.customPrefix = customPrefix;
        this.defaultPrefix = defaultPrefix;
    }

    protected Integer index;
    protected String elementType;
    protected String relatedRole;

    protected String roleURI;
    protected String id;
    protected String tag;
    protected String namespace;
    protected String href;
    protected String role;
    protected String type;
    protected String from;
    protected String to;
    protected String title;
    protected String priority;
    protected String schema;
    protected String label;
    protected String order;
    protected String weight;
    protected String arcrole;
    protected String value;
    protected String lang;

    protected SchemaElement schemaElement;
    protected List<FactElement> factElements;

    protected String rawTo;
    protected String rawFrom;
    protected String rawLabel;
    protected String rawHref;


    protected Boolean notEnd;

    protected HashMap<String, String> additionalAttributes;

    protected HashMap<String, String> processedLabels;

    protected String customPrefix;
    protected String defaultPrefix;

    public void setAttribute(String name, String value){
        switch (name){
            case ConstantValues.order:
                setOrder(value);
                break;
            case ConstantValues.weight:
                setWeight(value);
                break;
            case ConstantValues.arcrole:
            case ConstantValues.x_arcrole:
                setArcrole(value);
                break;
            case ConstantValues.from:
            case ConstantValues.x_from:
                setFrom(value);
                break;
            case ConstantValues.to:
            case ConstantValues.x_to:
                setTo(value);
                break;
            case ConstantValues.roleURI:
                setRoleURI(value);
                break;
            case ConstantValues.role:
            case ConstantValues.x_role:
                setRole(value);
                break;
            case ConstantValues.href:
            case ConstantValues.x_href:
                setHref(value);
                break;
            case ConstantValues.type:
            case ConstantValues.x_type:
                setType(value);
                break;
            case ConstantValues.label:
            case ConstantValues.x_label:
                setLabel(value);
                break;
            case ConstantValues.title:
            case ConstantValues.x_title:
                setTitle(value);
                break;
            case ConstantValues.lang:
                setLang(value);
                break;
            case ConstantValues.priority:
                setPriority(value);
                break;
            default:
                addAdditionalAttributes(name, value);
                break;

        }
    }


    public void addAdditionalAttributes(String key, String value){
        if(this.additionalAttributes == null){
            this.additionalAttributes = new HashMap<>();
        }
        this.additionalAttributes.put(key, value);
    }

    public Boolean getNotEnd() {
        return notEnd;
    }

    public void setNotEnd(Boolean notEnd) {
        this.notEnd = notEnd;
    }


    public List<FactElement> getFactElements() {
        return factElements;
    }

    public void setFactElements(List<FactElement> factElements) {
        this.factElements = factElements;
    }

    public String getRelatedRole() {
        return relatedRole;
    }

    public void setRelatedRole(String relatedRole) {
        this.relatedRole = relatedRole;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
    public String getRawHref() {
        return rawHref;
    }

    public void setRawHref(String rawHref) {
        this.rawHref = rawHref;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    public SchemaElement getSchemaElement() {
        return schemaElement;
    }

    public void setSchemaElement(SchemaElement schemaElement) {
        this.schemaElement = schemaElement;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getRoleURI() {
        return roleURI;
    }

    public void setRoleURI(String roleURI) {
        this.roleURI = roleURI;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getLabel() {
        return label;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getArcrole() {
        return arcrole;
    }

    public void setArcrole(String arcrole) {
        this.arcrole = arcrole;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRawTo() {
        return rawTo;
    }

    public void setRawTo(String rawTo) {
        this.rawTo = rawTo;
    }

    public String getRawFrom() {
        return rawFrom;
    }

    public void setRawFrom(String rawFrom) {
        this.rawFrom = rawFrom;
    }

    public String getRawLabel() {
        return rawLabel;
    }

    public void setRawLabel(String rawLabel) {
        this.rawLabel = rawLabel;
    }

    public HashMap<String, String> getProcessedLabels() {
        return processedLabels;
    }

    public void setProcessedLabels(HashMap<String, String> processedLabels) {
        this.processedLabels = processedLabels;
    }

    public String getCustomPrefix() {
        return null;
    }

    public void setCustomPrefix(String customPrefix) {

    }

    public String getDefaultPrefix() {
        return null;
    }

    public void setDefaultPrefix(String defaultPrefix) {

    }

    public HashMap<String, String> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(HashMap<String, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    @Override
    public String toString() {
        return "index="
                + index
                + ", elementType='"
                + elementType
                + '\''
                + ", roleURI='"
                + roleURI
                + '\''
                + ", id='"
                + id
                + '\''
                + ", tag='"
                + tag
                + '\''
                + ", namespace='"
                + namespace
                + '\''
                + ", href='"
                + href
                + '\''
                + ", role='"
                + role
                + '\''
                + ", type='"
                + type
                + '\''
                + ", from='"
                + from
                + '\''
                + ", to='"
                + to
                + '\''
                + ", title='"
                + title
                + '\''
                + ", priority='"
                + priority
                + '\''
                + ", schema='"
                + schema
                + '\''
                + ", label='"
                + label
                + '\''
                + ", order='"
                + order
                + '\''
                + ", weight='"
                + weight
                + '\''
                + ", arcrole='"
                + arcrole
                + '\''
                + ", value='"
                + value
                + '\''
                + ", lang='"
                + lang
                + '\''
                + ", rawTo='"
                + rawTo
                + '\''
                + ", rawFrom='"
                + rawFrom
                + '\''
                + ", rawLabel='"
                + rawLabel
                + '\''
                + ", rawHref='"
                + rawHref
                + '\''
                + ", additionalAttributes="
                + additionalAttributes
                + ", customPrefix='"
                + customPrefix
                + '\''
                + ", defaultPrefix='"
                + defaultPrefix
                + '\''
                + ", schemaElement='"
                + schemaElement
                + '\''
                + ", factElements='"
                + factElements
                + '\''
                + '}';
    }
}
