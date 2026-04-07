package Stack;
import java.util.Stack;

public class del_cons_ele {
    public static void main(String[] args){
        String[] arr1={"ab","aa","aa","bad","ab"};
        String[] arr2={"ab","aa","aa","ab"};
        check(arr1);
        check(arr2);
    }

    public static void check(String[] arr){
        Stack<String> stack = new Stack<>();
        for(String s : arr){
            if(stack.isEmpty() || !stack.peek().equals(s)){
                stack.push(s);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.size());
    }
    
}
