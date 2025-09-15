class NumberChecker4 {
    public static boolean isPrime(int n) {
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0)return false;
        return true;
    }
    public static boolean isNeon(int n) {
        int sq=n*n,s=0;
        while(sq>0){s+=sq%10;sq/=10;}
        return s==n;
    }
    public static boolean isSpy(int n) {
        int s=0,p=1;
        while(n>0){int d=n%10;s+=d;p*=d;n/=10;}
        return s==p;
    }
    public static boolean isAutomorphic(int n) {
        return String.valueOf(n*n).endsWith(String.valueOf(n));
    }
    public static boolean isBuzz(int n) {
        return n%7==0||String.valueOf(n).endsWith("7");
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println("Prime: "+isPrime(n));
        System.out.println("Neon: "+isNeon(n));
        System.out.println("Spy: "+isSpy(n));
        System.out.println("Automorphic: "+isAutomorphic(n));
        System.out.println("Buzz: "+isBuzz(n));
    }
}
