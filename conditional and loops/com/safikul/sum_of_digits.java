package loop_problems;

public class sum_of_digits {
    public static void main(String[] args) {
        int a=999999999;
        int temp=a;
        int sum=0;
        while(a>0){
            int b=a%10;
            sum += b;
            a=a/10;
        }
        System.out.println("The sum of the "+temp+" is: "+sum);
    }
}
