class NumberChecker2 {
    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int sum(int[] d) { int s=0; for(int x:d)s+=x; return s; }
    public static int sumSquares(int[] d) { int s=0; for(int x:d)s+=Math.pow(x,2); return s; }
    public static boolean isHarshad(int n, int[] d) { return n % sum(d) == 0; }
    public static int[][] frequency(int[] d) {
        int[] freq = new int[10];
        for (int x:d) freq[x]++;
        int[][] res = new int[10][2];
        for(int i=0;i<10;i++){ res[i][0]=i; res[i][1]=freq[i]; }
        return res;
    }
    public static void main(String[] args) {
        int n=21;
        int[] d=toDigits(n);
        System.out.println("Sum: "+sum(d));
        System.out.println("Sum of squares: "+sumSquares(d));
        System.out.println("Harshad: "+isHarshad(n,d));
        int[][] f=frequency(d);
        for(int i=0;i<10;i++) if(f[i][1]>0) System.out.println(f[i][0]+": "+f[i][1]);
    }
}
