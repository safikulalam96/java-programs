public class febonacci {
    public static void febo(int a,int b,int n){
        int c=a+b;
        if(n==0){
            return;
        }
        System.out.print(c+" ");
        febo(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;int n=7;

        if(n>=1){
            System.out.print(a+" ");
        }
        if(n>=2){
            System.out.print(b+" ");
            febo(a,b,n-2);
        }


    }
}
