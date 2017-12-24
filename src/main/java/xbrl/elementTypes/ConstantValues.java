package xbrl.elementTypes;

import java.util.HashMap;
import java.util.Map;

public class ConstantValues {

  // common string separation character(s)
  public static final String underscore = "_";

  // href id split character (typical id selector character)
  public static final String hash = "#";

  // attribute string names for use with Element method setAttribute(s) switch statement
  // Primarily to create a means to include various implementations (or improper implementations)
  public static final String id = "id";

  public static final String order = "order";

  public static final String weight = "weight";

  public static final String arcrole = "arcrole";
  public static final String x_arcrole = "xlink;arcrole";

  public static final String arcroleURI = "arcroleURI";

  public static final String from = "from";
  public static final String x_from = "xlink:from";

  public static final String to = "to";
  public static final String x_to = "xlink:to";

  public static final String roleURI = "roleURI";

  public static final String role = "role";
  public static final String x_role = "xlink:role";

  public static final String href = "href";
  public static final String x_href = "xlink:href";

  public static final String type = "type";
  public static final String x_type = "xlink:type";

  public static final String label = "label";
  public static final String x_label = "xlink:label";

  public static final String title = "title";
  public static final String x_title = "xlink:title";

  public static final String lang = "xlink:lang";

  public static final String priority = "priority";

  public static final String preferredLabel = "preferredLabel";

  // associative/bracketing tags
  public static final String presentationLink_tag = "presentationLink";
  public static final String definitionLink_tag = "definitionLink";
  public static final String calculationLink_tag = "calculationLink";
  public static final String labelLink_tag = "labelLink";

  public static final String presentationArc_tag = "presentationArc";
  public static final String calculationArc_tag = "calculationArc";
  public static final String definitionArc_tag = "definitionArc";
  public static final String labelArc_tag = "labelArc";

  public static final String loc_tag = "loc";
  public static final String label_tag = "label";

  public static final String[] nonFactTags = {"schemaRef", "linkbaseRef" , "roleRef", "arcroleRef", "context", "unit", "footnoteLink"};

  public static Map<String, String> linkNameForRelLinkbases(String linkType) {
    Map<String, String> tagMap = new HashMap<>();

    switch (linkType) {
      case "calculation":
      case "calc":
      case "cal":
        tagMap.put("link", calculationLink_tag);
        tagMap.put("arc", calculationArc_tag);
        tagMap.put("loc", loc_tag);
        tagMap.put("resource", "");
        return tagMap;

      case "definition":
      case "def":
        tagMap.put("link", definitionLink_tag);
        tagMap.put("arc", definitionArc_tag);
        tagMap.put("loc", loc_tag);
        tagMap.put("resource", "");
        return tagMap;
      case "newparse":
      case "pre":
        tagMap.put("link", presentationLink_tag);
        tagMap.put("arc", presentationArc_tag);
        tagMap.put("loc", loc_tag);
        tagMap.put("resource", "");
        return tagMap;
      case "reference":
      case "ref":
        tagMap.put("link", "");
        tagMap.put("arc", "");
        tagMap.put("loc", "");
        tagMap.put("resource", "");
        break;
      case "label":
      case "lab":
      case "lbl":
        tagMap.put("link", labelLink_tag);
        tagMap.put("arc", labelArc_tag);
        tagMap.put("loc", loc_tag);
        tagMap.put("resource", label_tag);
        return tagMap;
    }

    return tagMap;
  }
}
