package loop_problems;
import java.util.Scanner;
public class sumof_series {
    public static void main(String[] args) {
//      printing the result of this series  1-2+3-4+5...n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
