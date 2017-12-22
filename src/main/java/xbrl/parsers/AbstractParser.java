package xbrl.parsers;

import org.dom4j.Document;

import java.util.List;

public interface AbstractParser<T> {

  List<T> parse(Document document);
}
