class FactorsTasks {
    public static int[] factors(int n){
        int c=0;for(int i=1;i<=n;i++)if(n%i==0)c++;
        int[] f=new int[c];int j=0;
        for(int i=1;i<=n;i++)if(n%i==0)f[j++]=i;
        return f;
    }
    public static int greatest(int[] f){
        int m=f[0];for(int x:f)if(x>m)m=x;return m;
    }
    public static int sum(int[] f){int s=0;for(int x:f)s+=x;return s;}
    public static long product(int[] f){long p=1;for(int x:f)p*=x;return p;}
    public static double cubeProduct(int[] f){double p=1;for(int x:f)p*=Math.pow(x,3);return p;}
    public static void main(String[] args){
        int n=12;
        int[] f=factors(n);
        System.out.println("Greatest: "+greatest(f));
        System.out.println("Sum: "+sum(f));
        System.out.println("Product: "+product(f));
        System.out.println("Cube Product: "+cubeProduct(f));
    }
}
