import java.util.*;

public class CountOfDisinctDifferenceOfMaximumElementOfEverySubarray{
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int[] nextGreatestfromLeft = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        for(int i = 0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreatestfromLeft[i] = -1;
            }else{
                nextGreatestfromLeft[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        for(int i=0;i<arr.length;i++){
            if(nextGreater[i]!=-1){
                nextGreater[i] = Math.abs(nextGreater[i] - arr[i]);
            }
            if(nextGreatestfromLeft[i]!=-1){
                nextGreatestfromLeft[i] = Math.abs(nextGreatestfromLeft[i] - arr[i]);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(nextGreater[i]!=-1){
                set.add(nextGreater[i]);
            }
            if(nextGreatestfromLeft[i]!=-1){
                set.add(nextGreatestfromLeft[i]);
            }
        }
        System.out.println(set.size());
    }
}