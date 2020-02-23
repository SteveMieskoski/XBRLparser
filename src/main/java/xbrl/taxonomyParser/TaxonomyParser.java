package xbrl.taxonomyParser;

import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;


public class TaxonomyParser implements ElementHandler {
    Element parent = null;
    String parentPath = null;
    TaxonomyEntry taxonomyEntry = null;
    public TaxonomyParser(TaxonomyEntry taxonomyEntry) {
        this.taxonomyEntry = taxonomyEntry;
    }


    @Override
    public void onStart(ElementPath path) {

    }

    @Override
    public void onEnd(ElementPath path) {

    }
}