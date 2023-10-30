public class factorial {
    public static void factorial(int i,int j,int p){
        if(i==j){
            p*=j;
            System.out.print("The factorial of the numbers is: "+ p);
            return;
        }
        if(j<=0) {
            System.out.print("The factorial of the numbers is: "+ 1);
            return;
        }
        p*=i;
        factorial(i+1,j,p);
    }
    public static void main(String[] args) {
        factorial(1,5,1);
    }
}
