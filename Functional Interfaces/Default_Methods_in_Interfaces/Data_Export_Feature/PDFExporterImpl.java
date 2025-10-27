package Default_Methods_in_Interfaces.Data_Export_Feature;

public class PDFExporterImpl implements IDataExporter {
    @Override
    public void exportData(String data) {
        System.out.println("Exporting data to PDF: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (via PDF exporter logic): " + data);
    }

}
