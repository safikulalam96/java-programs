package loop_problems;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number to check it's factorial: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int product=1;
        for (int i = 1; i <=n ; i++) {
            product*=i;
        }
        System.out.println(product);
    }
}
