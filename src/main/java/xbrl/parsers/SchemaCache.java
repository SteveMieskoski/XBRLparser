package xbrl.parsers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xbrl.elementTypes.RoleTypeUsGaap;
import xbrl.elementTypes.SchemaContent;
import xbrl.elementTypes.SchemaElement;

import java.util.*;

public class SchemaCache {

    private final Logger logger = LoggerFactory.getLogger(SchemaCache.class);
    private LinkedList<RoleTypeUsGaap> schemaRoles;
    private List<String> entryPoints;
    private Map<String, SchemaElement> schemaElementsByName;
    private Map<String, SchemaElement> schemaElementsById;
    private Map<String, Map<String, SchemaElement>> cache;
    private List<String> cachedFilenames;

    public SchemaCache(SchemaContent schemaContent) {
        this.schemaElementsByName = schemaContent.getSchemaElements();
        this.schemaElementsById = schemaContent.getSchemaElementIds();
        this.schemaRoles = schemaContent.getSchemaRoles();
        this.entryPoints = schemaContent.getEntryPoints();
        this.cache = schemaContent.getPreCache();
        this.cachedFilenames = schemaContent.getFilenames();
    }

    public void addSchemaElements(SchemaElement value) {
        if (this.schemaElementsByName == null) {
            this.schemaElementsByName = new HashMap<>();
        }
        this.schemaElementsByName.put(value.getName(), value);
    }

    public void addManySchemaElements(SchemaContent schemaContent) {
        if (schemaContent != null) {
            for (String s : schemaContent.getSchemaElements().keySet()) {
                this.schemaElementsByName.put(s, schemaContent.getSchemaElements().get(s));
            }
            if (schemaContent.getPreCache() != null) {
                for (String s : schemaContent.getPreCache().keySet()) {
                    this.cache.put(s, schemaContent.getPreCache().get(s));
                }
                this.cachedFilenames.addAll(schemaContent.getFilenames());
            }
        }
    }

    public SchemaElement getElement(String name) {
        SchemaElement se = this.schemaElementsByName.get(name);
        if (name == null || this.schemaElementsByName == null) return null;
        if (se == null) {
            Optional<SchemaElement> sse =
                    this.schemaElementsByName.values().stream().filter(i -> name.equals(i.getId())).findAny();
            return sse.orElse(null);
        } else {
            return se;
        }
    }

    public List<String> filterAndUpdateCache(List<String> filenames) {
        clearCache();
        ArrayList<String> toParse = new ArrayList<>();
        for (String s : filenames) {
            if (!cachedFilenames.contains(s)) {
                toParse.add(s);
            } else {
                updateCache(s);
            }
        }
        return toParse;
    }

    private void clearCache() {
        this.schemaElementsByName.clear();
    }

    private void updateCache(String filename) {
        if (this.cache.get(filename) != null) {
            for (String s : this.cache.get(filename).keySet()) {
                this.schemaElementsByName.put(s, this.cache.get(filename).get(s));
            }
        }
    }

    public SchemaElement getElementById(String id) {
        return this.schemaElementsById.get(id);
    }

    // For Tests to gain access to private properties
    public <T> T check(String property) {
        // todo: cache is not clearing and being repopulated.  but it is using the cached version rather
        // todo: than re-parsing the files
        switch (property) {
            case "cache":
                return (T) cache;
            case "entryPoints":
                return (T) entryPoints;
            case "schemaRoles":
                return (T) schemaRoles;
            case "cachedFilenames":
                return (T) cachedFilenames;
        }
        return null;
    }


    @Override
    public String toString() {
        return "SchemaCache{" +
                "schemaRoles=" + schemaRoles +
                ", entryPoints=" + entryPoints +
                ", schemaElementsByName=" + schemaElementsByName +
                ", schemaElementsById=" + schemaElementsById +
                ", cache=" + cache +
                ", cachedFilenames=" + cachedFilenames +
                '}';
    }
}
