package hospital_patient_management_system;
import java.util.*;

//------------------------------------
//Patient Class
//------------------------------------
class Patient {
 String id;
 String name;

 public Patient(String id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Patient)) return false;
     Patient p = (Patient) o;
     return this.id.equals(p.id);
 }

 @Override
 public int hashCode() {
     return id.hashCode();
 }

 @Override
 public String toString() {
     return id + " - " + name;
 }
}

//------------------------------------
//Main Class
//------------------------------------
public class HospitalManagementSystem {
 public static void main(String[] args) {

     // Data Structures
     Set<Patient> admittedPatients = new HashSet<>();
     Queue<Patient> treatmentQueue = new LinkedList<>();
     Stack<Patient> dischargedStack = new Stack<>();
     List<Patient> patientHistory = new ArrayList<>();

     // ------------------------------------
     // 1. Admit Patients and Add to Queue
     // ------------------------------------
     admit(new Patient("P101", "Ravi Kumar"), admittedPatients, treatmentQueue, patientHistory);
     admit(new Patient("P102", "Anjali Singh"), admittedPatients, treatmentQueue, patientHistory);
     admit(new Patient("P103", "Mohit Sharma"), admittedPatients, treatmentQueue, patientHistory);
     admit(new Patient("P101", "Duplicate Ravi"), admittedPatients, treatmentQueue, patientHistory); // duplicate ignored

     // ------------------------------------
     // 2. Treat Patients in Order of Arrival
     // ------------------------------------
     System.out.println("\n=== Treating Patients ===");
     while (!treatmentQueue.isEmpty()) {
         Patient treated = treatmentQueue.poll();
         System.out.println("Treating → " + treated);

         // After treatment, discharge
         discharge(treated, admittedPatients, dischargedStack);
     }

     // ------------------------------------
     // 3. Re-Admission of Recently Discharged Patients
     // ------------------------------------
     System.out.println("\n=== Re-admitting Last Discharged Patient ===");

     if (!dischargedStack.isEmpty()) {
         Patient readmit = dischargedStack.pop();
         System.out.println("Re-admitting → " + readmit);
         admit(readmit, admittedPatients, treatmentQueue, patientHistory);
     }

     // ------------------------------------
     // 4. Final Summary
     // ------------------------------------
     System.out.println("\n=== Patient History ===");
     for (Patient p : patientHistory) {
         System.out.println(p);
     }

     System.out.println("\n=== Currently Admitted Patients ===");
     for (Patient p : admittedPatients) {
         System.out.println(p);
     }

     System.out.println("\n=== Treatment Queue ===");
     for (Patient p : treatmentQueue) {
         System.out.println(p);
     }
 }

 // ---------------------------------------------------
 // Helper Functions
 // ---------------------------------------------------

 // Admit patient if not already admitted
 public static void admit(Patient p,
                          Set<Patient> admittedSet,
                          Queue<Patient> queue,
                          List<Patient> history) {

     if (admittedSet.contains(p)) {
         System.out.println("Patient already admitted → " + p);
     } else {
         admittedSet.add(p);
         queue.add(p);
         history.add(p);
         System.out.println("Admitted → " + p);
     }
 }

 // Discharge patient and push to Stack
 public static void discharge(Patient p,
                              Set<Patient> admittedSet,
                              Stack<Patient> dischargedStack) {

     admittedSet.remove(p);
     dischargedStack.push(p);
     System.out.println("Discharged → " + p);
 }
}
