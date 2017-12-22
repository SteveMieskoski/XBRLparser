package xbrl.exceptions;

import javax.management.modelmbean.XMLParseException;

public class AttributeFormatException extends XMLParseException {

  public AttributeFormatException(String s) {
    super(s);
  }
}
