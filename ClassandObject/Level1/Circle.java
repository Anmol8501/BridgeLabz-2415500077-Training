
public class Circle {
    
    private double radius;

 
    public Circle(double radius) {
        this.radius = radius;
    }

   
    public double calculateArea() {
      
        return Math.PI * this.radius * this.radius;
    }

    
    public double calculateCircumference() {
        
        return 2 * Math.PI * this.radius;
    }

    
    public void displayCalculations() {
        System.out.println("Circle with radius: " + this.radius);
        
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }


    public static void main(String[] args) {
        
        Circle myCircle = new Circle(5.0);

        
        myCircle.displayCalculations();
    }
}