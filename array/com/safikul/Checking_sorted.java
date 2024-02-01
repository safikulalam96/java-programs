package array;
import java.util.Scanner;
public class Checking_sorted {
    static boolean sorted (int [] array){
        boolean check =true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]){
                check = false;
                break;
            }
        }
         return check;
    }
    public static void main(String[] args) {
        Scanner ex=new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n=ex.nextInt();
        int [] array=new int[n];

        System.out.println("Enter the array of "+n+" length");
        for (int i = 0; i < array.length; i++) {
            array[i]=ex.nextInt();
        }
        boolean ans=sorted(array);
        System.out.println("Is the array Sorted : "+ans);
    }
}
