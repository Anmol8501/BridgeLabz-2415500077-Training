package Default_Methods_in_Interfaces.Data_Export_Feature;

public class CSVExporterImpl implements IDataExporter {
    @Override
    public void exportData(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }
    
}
