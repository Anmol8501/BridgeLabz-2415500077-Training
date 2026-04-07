package Stack;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("Original Stack: " + st);
        reverseStackRec(st);
        System.out.println("Reversed Stack: " + st);
    }

    public static void reverseStackRec(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reverseStackRec(st);
        insertAtBottom(st, top);
    }

    public static void insertAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, value);
        st.push(top);
    }
}