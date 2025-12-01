package copy_list_elements;

import java.util.*;

public class Main {
	public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = List.of(10, 20, 30);
        copyList(numbers, integers);
        System.out.println(numbers);
    }
}
