package loop_problems;

public class reverse {
    public static void main(String[] args) {
        int a=8652;
        int temp=a;
        int rev=0;
        while(a>0){
            int b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        System.out.print("The Reverse of "+temp+" is : => "+rev);
    }
}
