package Stack;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMax {
    public static void main(String[] args) {
int[] arr = {1, 3, 1, 2, 0, 5};
int k = 3;
int[] result = slidingWindowMaximum(arr, k);
for (int num : result) {
    System.out.print(num + " ");
}
    }
    
    public static int[] slidingWindowMaximum(int[] nums, int k) {
if (nums == null || nums.length == 0) return new int[0];

int[] result = new int[nums.length - k + 1];
Deque<Integer> deque = new LinkedList<>();

for (int i = 0; i < nums.length; i++) {
    if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
    deque.pollFirst();
    }
    
    while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
    deque.pollLast();
    }
    
    deque.addLast(i);

    if (i >= k - 1) {
    result[i - k + 1] = nums[deque.peekFirst()];
    }
}

return result;
}
}