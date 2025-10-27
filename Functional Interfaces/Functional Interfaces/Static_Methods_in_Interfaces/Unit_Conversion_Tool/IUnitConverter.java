package Static_Methods_in_Interfaces.Unit_Conversion_Tool;

public interface IUnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
