package Marker_Interfaces.Sensitive_Data_Tagging;

public class CustomerInfoImpl implements ISensitiveData {
    String name;
    String creditCardNumber;

    CustomerInfoImpl(String name, String cc) {
        this.name = name;
        this.creditCardNumber = cc;
    }
    
}
