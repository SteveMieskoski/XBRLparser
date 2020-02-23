package scraps.xbrlSchemas;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class EntryOrig {

    String currentFile;
    HashSet<String> attrs = new HashSet<>();
    HashSet<String> ids = new HashSet<>();

    public EntryOrig(){
        String allEntryPoint = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/entire/us-gaap-entryPoint-all-2017-01-31.xsd";
        String filename =
                "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/sec/us-gaap-2017-01-31.xsd";
        String file1 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-cal-2017-01-31.xml";
        String file2 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-acec-def-2017-01-31.xml";
        String file3 = "/home/steve/projects/2_XBRL/XBRLparser/src/main/resources/schemas/us-gaap/dis/us-gaap-dis-cc-def-2017-01-31.xml";
        parse(allEntryPoint);
//        databaseConnection();
    }

    public void parseOrig(String filename) {
        System.out.println("filename: " + filename);
        this.currentFile = filename;
//        this.schemaContent.startFileCache(filename);
        try {
            SAXReader reader = new SAXReader();

//            reader.addHandler("/schema", new Schema());
            reader.addHandler("link", new Schema());

            Document document = reader.read(filename);
            Element root = document.getRootElement();

            // iterate through child elements of root
            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element element = it.next();
                System.out.println(element.getName()); // todo remove dev item
//                System.out.println(element); // todo remove dev item
                // do something
            }

            for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
                Attribute attribute = it.next();
                System.out.println(attribute); // todo remove dev item

                // do something
            }
            //      System.out.println("SCHEMA PARSE COMPLETE");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        System.out.println("============================"); // todo remove dev item
        System.out.println(attrs); // todo remove dev item
        System.out.println(ids); // todo remove dev item

    }

    public void parse(String filename) {
        System.out.println("filename: " + filename);
        this.currentFile = filename;
        try {
            SAXReader reader = new SAXReader();
            reader.setEntityResolver(new EntityResolver() {
                @Override
                public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
                    System.out.println("publicId : " + publicId); // todo remove dev item
                    System.out.println("systemId : " + systemId); // todo remove dev item
                    return null;
                }
            });

            Document document = reader.read(filename);
            Element root = document.getRootElement();

            // iterate through child elements of root
            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element element = it.next();
System.out.println(element.getQualifiedName()); // todo remove dev item
                for (Iterator<Attribute> itt = element.attributeIterator(); itt.hasNext();) {
                    Attribute attribute = itt.next();
//                    System.out.println(attribute.getNamespaceURI()); // todo remove dev item
//                   System.out.println(attribute.getQualifiedName()); // todo remove dev item
                    System.out.print(attribute.getName() + " : "); // todo remove dev item
                    System.out.println(attribute.getValue()); // todo remove dev item

//                    System.out.println(attribute); // todo remove dev item
                }
                System.out.println("----------------------------------"); // todo remove dev item

//                System.out.println(element.getName()); // todo remove dev item
            }

//            for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
//                Attribute attribute = it.next();
//                                System.out.println(attribute); // todo remove dev item
//            }
            //      System.out.println("SCHEMA PARSE COMPLETE");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        System.out.println("============================"); // todo remove dev item
        System.out.println(attrs); // todo remove dev item
        System.out.println(ids); // todo remove dev item

    }

    class Schema implements ElementHandler {

        public Schema() {}

        @Override
        public void onStart(ElementPath path) {
            System.out.println(path.getPath()); // todo remove dev item
//            path.addHandler("element", new ElementSchema());
//            path.addHandler("//*", new SchemaDemo());
            Element element = path.getCurrent();
            for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
                Attribute attribute = attrIter.next();
                if(attribute != null){
                    System.out.print(attribute.getName() + " : "); // todo remove dev item
                    System.out.println(attribute.getValue()); // todo remove dev item
                }
            }
//            path.addHandler("annotation/appinfo/roleType", new SchemaParser.RoleType());
//            path.addHandler("annotation/appinfo/linkbaseRef", new SchemaParser.LinkBases());
        }

        @Override
        public void onEnd(ElementPath path) {
            Element element = path.getCurrent();
            System.out.println(path.getPath()); // todo remove dev item
//            path.removeHandler("element");
//            path.removeHandler("//*");
//            path.removeHandler("annotation/appinfo/roleType");
//            path.removeHandler("annotation/appinfo/linkbaseRef");
//            schemaContent.stopFileCache(currentFile);
            element.detach();
        }
    }

    class SchemaDemo implements ElementHandler {

        SchemaDemo() {}

        @Override
        public void onStart(ElementPath path) {}

        @Override
        public void onEnd(ElementPath path) {
            Element element = path.getCurrent();
            for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
                Attribute attribute = attrIter.next();
                if(attribute != null){
                    System.out.print(attribute.getName() + " : "); // todo remove dev item
                    System.out.println(attribute.getValue()); // todo remove dev item
                }
            }

            element.detach();
        }
    }

    class ElementSchema implements ElementHandler {

        ElementSchema() {}

        @Override
        public void onStart(ElementPath path) {}

        @Override
        public void onEnd(ElementPath path) {
/*            Element element = path.getCurrent();
            SchemaElement schemaElement = new SchemaElement();
            for (Iterator<Attribute> attrIter = element.attributeIterator(); attrIter.hasNext(); ) {
                Attribute attribute = attrIter.next();
                if(attribute != null){
                    if(attribute.getName() != null && attribute.getValue() != null){
                        String str = attribute.getName();
                        attrs.add(str);
                        if(str.equals("id")){
                            ids.add(attribute.getValue());
                        }
                        System.out.print(attribute.getName() + " : "); // todo remove dev item
                        System.out.println(attribute.getValue()); // todo remove dev item
//                schemaElement.setAttribute(attribute.getName(), attribute.getValue());
                    }
                }
            }

            element.detach();*/
        }
    }

}
