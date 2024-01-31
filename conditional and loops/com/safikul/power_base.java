package loop_problems;
import java.util.Scanner;
public class power_base {
    public static void main(String[] args) {

        Scanner ex= new Scanner(System.in);

        System.out.print("Enter the base: ");
        int b=ex.nextInt();
        System.out.print("Enter the power: ");
        int p=ex.nextInt();
        int ans=1;

        for (int i = 1; i <= p; i++) {
            ans*=b;
        }
        System.out.print("The answer is: "+ans);
    }
}
