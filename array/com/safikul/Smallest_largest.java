package array;
import java.util.Arrays;
import java.util.Scanner;
public class Smallest_largest {
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);

        System.out.print("Enter the length of the array ");
        int n=ex.nextInt();

        int [] array=new int[n];

        System.out.print("Enter the array ");
        for (int i = 0; i < array.length; i++) {
            array[i]=ex.nextInt();
        }
        Arrays.sort(array);
        {
            System.out.println("Smallest " + array[0]);
            System.out.print("Largest " + array[array.length - 1]);
        }
    }
}
