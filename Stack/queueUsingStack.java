package Stack;
import java.util.Stack;

public class queueUsingStack {

    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        addToQueue(s1, 1);
        addToQueue(s1, 2);
        addToQueue(s1, 3);
        addToQueue(s1, 4);
        addToQueue(s1, 5);
        printQueue(s1);
    }

    public static void addToQueue(Stack<Integer> s1, int value){
        s1.push(value);
    }

    public static void printQueue(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        while(!s2.isEmpty()){
            int value = s2.pop();
            System.out.print(value + " ");
            s1.push(value);
        }
        System.out.println();
    }
}