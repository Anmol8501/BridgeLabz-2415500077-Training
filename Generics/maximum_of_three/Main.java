package maximum_of_three;

public class Main {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	        T max = x;
	        if (y.compareTo(max) > 0) max = y;
	        if (z.compareTo(max) > 0) max = z;
	        return max;
	    }

	    public static void main(String[] args) {
	        System.out.println("Max of 3, 7, 5 = " + maximum(3, 7, 5));
	        System.out.println("Max of apple, orange, banana = " + maximum("apple", "orange", "banana"));
	    }
}
