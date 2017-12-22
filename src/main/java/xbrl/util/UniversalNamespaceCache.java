package xbrl.util;

import org.w3c.dom.*;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UniversalNamespaceCache implements NamespaceContext, org.jaxen.NamespaceContext {
  private static final String DEFAULT_NS = "DEFAULT";
  private Map<String, String> prefix2Uri = new HashMap<String, String>();
  private Map<String, String> uri2Prefix = new HashMap<String, String>();

  /**
   * This constructor parses the document and stores all namespaces it can find. If toplevelOnly is
   * true, only namespaces in the root are used.
   *
   * @param document source document
   * @param toplevelOnly restriction of the search to enhance performance
   */
  public UniversalNamespaceCache(Document document, boolean toplevelOnly) {
    examineNode(document.getFirstChild(), toplevelOnly);
    for (String key : prefix2Uri.keySet()) {
      System.out.println("prefix " + key + ": uri " + prefix2Uri.get(key));
    }
  }

  public Map<String, String> getUri2Prefix() {
    return uri2Prefix;
  }

  /**
   * A single node is read, the namespace attributes are extracted and stored.
   *
   * @param node to examine
   * @param attributesOnly, if true no recursion happens
   */
  private void examineNode(Node node, boolean attributesOnly) {
    NamedNodeMap attributes = node.getAttributes();
    if (node.getNodeType() != Node.COMMENT_NODE) {
      for (int i = 0; i < attributes.getLength(); i++) {
        Node attribute = attributes.item(i);
        storeAttribute((Attr) attribute);
      }

      if (!attributesOnly) {
        NodeList chields = node.getChildNodes();
        for (int i = 0; i < chields.getLength(); i++) {
          Node chield = chields.item(i);
          if (chield.getNodeType() == Node.ELEMENT_NODE) examineNode(chield, false);
        }
      }
    } else {
      examineNode(node.getNextSibling(), attributesOnly);
    }
  }

  /**
   * This method looks at an attribute and stores it, if it is a namespace attribute.
   *
   * @param attribute to examine
   */
  private void storeAttribute(Attr attribute) {
    // examine the attributes in namespace xmlns
    if (attribute.getNodeName().equals(XMLConstants.XMLNS_ATTRIBUTE)) {
      putInCache(DEFAULT_NS, attribute.getNodeValue());
    } else {
      // The defined prefixes are stored here
      putInCache(attribute.getName().replace("xmlns:", ""), attribute.getValue());
    }
  }

  private void putInCache(String prefix, String uri) {
    prefix2Uri.put(prefix, uri);
    uri2Prefix.put(uri, prefix);
  }

  /**
   * This method is called by XPath. It returns the default namespace, if the prefix is null or "".
   *
   * @param prefix to search for
   * @return uri
   */
  @Override
  public String getNamespaceURI(String prefix) {
    System.out.println(prefix);
    if ("xbrli".equals(prefix)) {
      return "http://www.xbrl.org/2003/instance";
    } else if (prefix.equals(XMLConstants.DEFAULT_NS_PREFIX)) {
      return "http://www.xbrl.org/2003/instance";
    } else {
      String val = prefix2Uri.get(prefix);
      if (val != null) {
        return val;
      } else {
        return XMLConstants.NULL_NS_URI;
      }
    }
  }

  /** This method is not needed in this context, but can be implemented in a similar way. */
  public String getPrefix(String namespaceURI) {
    return uri2Prefix.get(namespaceURI);
  }

  public Iterator getPrefixes(String namespaceURI) {
    // Not implemented
    return null;
  }

  @Override
  public String translateNamespacePrefixToUri(String prefix) {
    //            System.out.println(prefix);
    if ("xbrli".equals(prefix)) {
      return "http://www.xbrl.org/2003/instance";
    } else if (prefix.equals(XMLConstants.DEFAULT_NS_PREFIX)) {
      return "http://www.xbrl.org/2003/instance";
    } else {
      String val = prefix2Uri.get(prefix);
      if (val != null) {
        return val;
      } else {
        return XMLConstants.NULL_NS_URI;
      }
    }
  }
}
