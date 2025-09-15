abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private java.util.List<String> records = new java.util.ArrayList<>();

    InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        for (String r : records) {
            System.out.println(r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private java.util.List<String> records = new java.util.ArrayList<>();

    OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        for (String r : records) {
            System.out.println(r);
        }
    }
}
