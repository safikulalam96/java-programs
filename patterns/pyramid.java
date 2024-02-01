package patterns;
import java.util.Scanner;
public class pyramid{
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int r=ex.nextInt();


        for (int i = 1; i <=r; i++) {
            for (int k = 1; k <=r-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                    System.out.print("*");
            }

            System.out.println();
        }

    }
}
