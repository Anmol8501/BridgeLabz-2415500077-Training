public class NullPointerDemo {

    
    public static void generateException() {
        String text = null; 

        System.out.println("Length of string: " + text.length());
    }


    public static void handleException() {
        String text = null; 
        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        
        handleException();
    }
}
