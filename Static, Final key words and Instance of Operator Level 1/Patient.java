class Patient {
    static String hospitalName = "Central Hospital";
    private static int totalPatients = 0;
    final String patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Patient ID: " + p.patientID);
        }
    }
}
