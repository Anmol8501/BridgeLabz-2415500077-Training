package Linear_and_Binary_Search;

import java.util.Arrays;

public class ChallengeProblem2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        boolean[] visited = new boolean[arr.length + 1];

        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                visited[num] = true;
            }
        }

        int missing = 1;
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                missing = i;
                break;
            }
        }

        System.out.println("First Missing Positive: " + missing);

        Arrays.sort(arr);
        int target = 3;
        int index = Arrays.binarySearch(arr, target);

        System.out.println("Target Index: " + (index >= 0 ? index : -1));
    }
}
