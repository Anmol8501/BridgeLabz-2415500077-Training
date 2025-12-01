package numeric_sum;

import java.util.*;

public class Main {
	public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4);
        List<Double> doubles = List.of(2.5, 3.5, 4.5);
        System.out.println("Sum Integers: " + sumNumbers(ints));
        System.out.println("Sum Doubles: " + sumNumbers(doubles));
    }
}
