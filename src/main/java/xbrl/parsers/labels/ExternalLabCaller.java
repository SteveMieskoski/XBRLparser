package xbrl.parsers.labels;

import org.dom4j.Element;

import java.util.UUID;

public interface ExternalLabCaller extends LabCaller {

  void constructLabel(Element element, UUID current, UUID prior);
}
