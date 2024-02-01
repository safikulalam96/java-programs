package patterns;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int r=ex.nextInt();


        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
