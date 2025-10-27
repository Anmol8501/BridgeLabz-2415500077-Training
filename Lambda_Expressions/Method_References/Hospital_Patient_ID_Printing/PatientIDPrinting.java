package Method_References.Hospital_Patient_ID_Printing;

import java.util.Arrays;
import java.util.List;

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("PT101", "PT102", "PT103", "PT104");

        System.out.println("=== Hospital Patient IDs ===");
        
        patientIDs.forEach(System.out::println);
    }
}
