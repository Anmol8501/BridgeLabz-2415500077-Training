class NumberChecker5 {
    public static int sumDivisors(int n) {
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0)s+=i;
        return s;
    }
    public static boolean isPerfect(int n){ return sumDivisors(n)==n; }
    public static boolean isAbundant(int n){ return sumDivisors(n)>n; }
    public static boolean isDeficient(int n){ return sumDivisors(n)<n; }
    public static int fact(int n){ int f=1;for(int i=1;i<=n;i++)f*=i;return f; }
    public static boolean isStrong(int n){
        int s=0,t=n;
        while(t>0){s+=fact(t%10);t/=10;}
        return s==n;
    }
    public static void main(String[] args){
        int n=145;
        System.out.println("Perfect: "+isPerfect(n));
        System.out.println("Abundant: "+isAbundant(n));
        System.out.println("Deficient: "+isDeficient(n));
        System.out.println("Strong: "+isStrong(n));
    }
}
