package patterns;
import java.util.Scanner;
public class hollow {
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int r=ex.nextInt();
        System.out.println("Enter the number of column: ");
        int c=ex.nextInt();

        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <= c; j++) {
                if(i==1 ||i==r || j==c || j==1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
