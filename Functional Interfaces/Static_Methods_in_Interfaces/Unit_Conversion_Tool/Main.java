package Static_Methods_in_Interfaces.Unit_Conversion_Tool;

public class Main {
    public static void main(String[] args) {
        System.out.println("10 km = " + IUnitConverter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + IUnitConverter.kgToLbs(5) + " lbs");
    }
}
