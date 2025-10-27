package Marker_Interfaces.Sensitive_Data_Tagging;

public class EncryptionProcessor {
    static void encryptIfSensitive(Object obj) {
        if (obj instanceof ISensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Data is not marked as sensitive.");
        }
    }
}
