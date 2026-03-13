public class Permutaion_String {
    static void permutation(String s, String r) {
        if (s.length() == 0) {
            System.out.println(r);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), r + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        permutation("ABC", "");
    }
}
