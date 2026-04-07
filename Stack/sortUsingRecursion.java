package Stack;
import java.util.Stack;

public class sortUsingRecursion {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original Stack: " + st);
        sortStackRec(st);
        System.out.println("Sorted Stack: " + st);
    }

    public static void sortStackRec(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        sortStackRec(st);
        insertInSortedOrder(st, top);
    }

    public static void insertInSortedOrder(Stack<Integer> st, int value) {
        if (st.isEmpty() || st.peek() <= value) {
            st.push(value);
            return;
        }

        int top = st.pop();
        insertInSortedOrder(st, value);
        st.push(top);
    }


    
}
