interface DataExporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: {\"data\":\"" + data + "\"}");
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting CSV: " + data); }
}

public class DataExporterDemo {
    public static void main(String[] args) {
        CSVExporter exporter = new CSVExporter();
        exporter.export("Report");
        exporter.exportToJSON("Report");
    }
}
