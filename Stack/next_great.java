package Stack;
import java.util.Stack;

public class next_great {
    public static void main(String[] args){
        int[] arr={1,3,2,4};
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nge[i]=-1;
            } else {
                nge[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println("Next Greater Elements:");
        for(int i=0;i<n;i++){
            System.out.print(nge[i] + " ");
        }
    }
    
}






