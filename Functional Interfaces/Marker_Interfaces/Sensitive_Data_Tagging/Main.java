package Marker_Interfaces.Sensitive_Data_Tagging;

public class Main {
    public static void main(String[] args) {
        CustomerInfoImpl customer = new CustomerInfoImpl("Alice", "1234-5678-9876-5432");
        EncryptionProcessor.encryptIfSensitive(customer); 
        EncryptionProcessor.encryptIfSensitive("Random String"); 
    }
}
