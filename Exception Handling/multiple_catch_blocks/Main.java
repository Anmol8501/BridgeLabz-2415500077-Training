package multiple_catch_blocks;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int index = 5;  // invalid index
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
