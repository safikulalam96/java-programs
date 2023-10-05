// printing febonacci series

package com.safikul;
import java.util.Scanner;
public class febonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth term to print febonacci series ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        // fecbonaci of the nth term
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);




    //febonacci series upto nth term
    /*    if (n >= 1) {
            System.out.print(a + ", ");
        }
        if (n >= 2) {
            System.out.print(b + ", ");
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + ", ");

        }
    */


    }

}
