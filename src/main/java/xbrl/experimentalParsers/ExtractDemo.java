package xbrl.experimentalParsers;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import xbrl.elementTypes.ConstantValues;

import java.util.Map;

public class ExtractDemo {
    private Map<String, String> tagMap;

    public ExtractDemo(String type) {
        tagMap = ConstantValues.linkNameForRelLinkbases(type);
    }

    public void parse(String url) throws Exception {
        SAXReader reader = new SAXReader();


        Document document = reader.read(url);
        Element rootElement = document.getRootElement();
        rootElement.selectNodes("/linkbase");
       /* for (Iterator<Node> it = results.iterator(); it.hasNext(); ) {
            Element element = (Element) it.next();
        }*/
    }

}
