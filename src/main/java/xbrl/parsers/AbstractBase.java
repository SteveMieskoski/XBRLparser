package xbrl.parsers;

import org.dom4j.Document;
import org.dom4j.io.XMLWriter;

public abstract class AbstractBase {

    protected XMLWriter writer;

    public AbstractBase() {
    }

    public void run(String filename){
        try {
            writer = createXMLWriter();

            Document document = parse(filename);
            process(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Document parse(String xmlFile) throws Exception {
        throw new RuntimeException(
                "parse(String xmlFile) not implemented in this demo");
    }

    protected void process(Document document) throws Exception {
        getXMLWriter().write(document);
        getXMLWriter().flush();
    }

    protected XMLWriter getXMLWriter() throws Exception {
        if (writer == null) {
            writer = createXMLWriter();
        }
        return writer;
    }

    protected XMLWriter createXMLWriter() throws Exception {
        return new XMLWriter();
    }

}
