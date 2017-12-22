package xbrl.parsers;

public class TagAndAttributeConstants {

  public static final String[] contextVariations = {
    "//*[name()='context']", "//*[name()='xbrli:context']"
  };

  public static final String[] elementVariations = {
    "//*[name()='xs:element']", "//*[name()='element']"
  };
  public static final String[] roleTypeVariations = {"//link:roleType", "//roleType"};
  public static final String[] linkbaseRefVariations = {"//link:linkbaseRef", "//linkbaseRef"};
  public static final String[] definitionVariations = {"./link:definition", "./definition"};
  public static final String[] usedOnVariations = {"./link:usedOn", "./usedOn"};
}
