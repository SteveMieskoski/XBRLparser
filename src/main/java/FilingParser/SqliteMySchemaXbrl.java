package FilingParser;

public interface SqliteMySchemaXbrl {

  static String drop =
      "DROP TABLE IF EXISTS linkBases;\n"
          + "DROP TABLE IF EXISTS locators;\n"
          + "DROP TABLE IF EXISTS arcs;\n"
          + "DROP TABLE IF EXISTS facts;\n"
          + "DROP TABLE IF EXISTS contexts;";

  static String linkBases =
      "CREATE TABLE linkBases\n"
          + "(\n"
          + "    linkBase_key INTEGER PRIMARY KEY AUTOINCREMENT,\n"
          + "    ref_id      TEXT,\n"
          + "    type        TEXT,\n"
          + "    role        TEXT,\n"
          + "    title       TEXT,\n"
          + "    schema      TEXT\n"
          + ");\n";

  static String locators =
      "CREATE TABLE locators\n"
          + "(\n"
          + "    locator_key INTEGER PRIMARY KEY AUTOINCREMENT,\n"
          + "    ref_id     TEXT,\n"
          + "    type       TEXT,\n"
          + "    href       TEXT,\n"
          + "    label      TEXT\n"
          + ")";

  static String arcs =
      "CREATE TABLE arcs\n"
          + "(\n"
          + "    arc_key   INTEGER PRIMARY KEY AUTOINCREMENT,\n"
          + "    ref_id   TEXT,\n"
          + "    role     TEXT,\n"
          + "    'from'   TEXT,\n"
          + "    'to'     TEXT,\n"
          + "    type     TEXT,\n"
          + "    'order'  TEXT,\n"
          + "    use      TEXT,\n"
          + "    weight   TEXT,\n"
          + "    priority TEXT\n"
          + ")";

  static String facts =
      "CREATE TABLE facts\n"
          + "(\n"
          + "    fact_key    INTEGER PRIMARY KEY AUTOINCREMENT,\n"
          + "    concept_ref TEXT,\n"
          + "    context_ref TEXT,\n"
          + "    unit_ref    TEXT,\n"
          + "    decimals    TEXT,\n"
          + "    value       TEXT\n"
          + ")";

  static String contexts =
      "CREATE TABLE contexts\n"
          + "(\n"
          + "    context_key       INTEGER PRIMARY KEY AUTOINCREMENT,\n"
          + "    context_id        TEXT,\n"
          + "    identifier        TEXT,\n"
          + "    identifier_schema TEXT,\n"
          + "    start_date        TEXT,\n"
          + "    end_date          TEXT,\n"
          + "    isInstant         NUMERIC\n "
          + "    segment_dim       TEXT,\n"
          + "    segment_value     TEXT"
          + ")";
}
