public class volume_of_earth {
    public static void main(String[] args) {
        double radius = 6378; // Radius of the Earth in kilometers
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Calculate volume using the formula 4/3 * π * r^3
        double volumeInMiles = volume * 0.239913; // Convert volume from cubic kilometers to cubic miles (1 km³ = 0.239913 mi³)
        System.out.print("The volume of earth in cubic kilometers is "+ volume+" and cubic miles is "+volumeInMiles + ".");
    }
    
}
