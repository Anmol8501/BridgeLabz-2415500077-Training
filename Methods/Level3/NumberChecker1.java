class NumberChecker1 {
    public static int countDigits(int n) { return String.valueOf(n).length(); }
    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int[] d) {
        int n = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, n);
        int num = 0; for (int x : d) num = num * 10 + x;
        return sum == num;
    }
    public static int[] largestTwo(int[] d) {
        int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > l1) { l2 = l1; l1 = x; }
            else if (x > l2) l2 = x;
        }
        return new int[]{l1,l2};
    }
    public static int[] smallestTwo(int[] d) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < s1) { s2 = s1; s1 = x; }
            else if (x < s2) s2 = x;
        }
        return new int[]{s1,s2};
    }
    public static void main(String[] args) {
        int n = 153;
        int[] d = toDigits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(d));
        int[] l = largestTwo(d);
        System.out.println("Largest: " + l[0] + " Second Largest: " + l[1]);
        int[] s = smallestTwo(d);
        System.out.println("Smallest: " + s[0] + " Second Smallest: " + s[1]);
    }
}
