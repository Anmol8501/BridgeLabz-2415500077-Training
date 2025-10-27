package Marker_Interfaces.Data_Serialization_for_Backup;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeImpl emp = new EmployeeImpl("John", 101);

            FileOutputStream fileOut = new FileOutputStream("backup.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Employee data backed up successfully!");

            // Deserialize (restore)
            FileInputStream fileIn = new FileInputStream("backup.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            EmployeeImpl restored = (EmployeeImpl) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Restored Employee: " + restored);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
