package Stack;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] prices = {70, 60, 50, 80, 100};
        int[] span = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        for (int s : span) {
            System.out.println(s);
        }
    }
    
}
