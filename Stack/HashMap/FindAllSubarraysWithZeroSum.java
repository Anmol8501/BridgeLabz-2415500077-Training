package Stack.HashMap;

import java.util.*;

public class FindAllSubarraysWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, -3};
        List<int[]> subarrays = findSubarrays(arr);
        for (int[] subarray : subarrays) {
            System.out.println("Subarray from index " + subarray[0] + " to " + subarray[1]);
        }
    }
    public static List<int[]> findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
}