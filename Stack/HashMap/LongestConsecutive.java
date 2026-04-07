package Stack.HashMap;

import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence(arr));
    }
    public static int longestSequence(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) map.put(num, true);

        int max = 0;

        for (int num : nums) {
            if (!map.containsKey(num - 1)) {
                int curr = num;
                int count = 1;

                while (map.containsKey(curr + 1)) {
                    curr++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }
}
