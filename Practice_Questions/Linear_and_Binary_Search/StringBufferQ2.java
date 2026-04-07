package Linear_and_Binary_Search;

public class StringBufferQ2 {
    public static void main(String[] args) {
        int n = 1_000_000;

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder));
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer));
    }
}
