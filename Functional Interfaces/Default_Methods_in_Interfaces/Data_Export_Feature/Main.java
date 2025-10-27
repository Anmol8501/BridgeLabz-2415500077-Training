package Default_Methods_in_Interfaces.Data_Export_Feature;

public class Main {
    public static void main(String[] args) {
        IDataExporter csv = new CSVExporterImpl();
        csv.exportData("Report1");
        csv.exportToJSON("Report1"); 

        IDataExporter pdf = new PDFExporterImpl();
        pdf.exportData("Report2");
        pdf.exportToJSON("Report2"); 
    }
}
