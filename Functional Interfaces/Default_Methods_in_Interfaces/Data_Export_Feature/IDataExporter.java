package Default_Methods_in_Interfaces.Data_Export_Feature;

public interface IDataExporter {
    void exportData(String data);

    default void exportToJSON(String data) {
        System.out.println("Default JSON export not implemented for this exporter.");
    }
}
