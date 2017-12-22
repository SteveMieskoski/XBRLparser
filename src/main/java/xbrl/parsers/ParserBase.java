package xbrl.parsers;

import org.dom4j.Document;

public interface ParserBase {


    void run(String filename);

    Document parse(String xmlFile) throws Exception;

    void process(Document document) throws Exception;

}
