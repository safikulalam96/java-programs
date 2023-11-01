public class stackheight {
    public static int callow(int x, int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpow1= callow(x,n-1);
        return x * xpow1;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans= callow(x,n);
        System.out.println(ans);
    }
}
