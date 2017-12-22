package xbrl.parsers;

import org.dom4j.Document;

import java.util.List;
import java.util.Map;

public interface ILinkbaseParser<T> {

  List<T> parse(Document xmlDocument);

//  Map<String, RoleRef> getRoleRefs();
}
