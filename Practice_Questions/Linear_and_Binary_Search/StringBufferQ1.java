package Linear_and_Binary_Search;

public class StringBufferQ1 {
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "World", "!"};

        StringBuffer buffer = new StringBuffer();

        for (String s : arr) {
            buffer.append(s);
        }

        System.out.println(buffer.toString());
    }
}
