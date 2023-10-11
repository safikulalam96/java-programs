package com.safikul.safikul;
import java.util.Scanner;
public class threenoArmstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number to check it is Armstrong or not ");
        int no= in.nextInt();

        //function calling
        boolean isArmstrong=arms(no);

        // checking armstrong or not
        if(isArmstrong){
            System.out.println("The  is Armstrong ");
        }
        else
            System.out.println("The is not an Armstrong ");
    }
    static boolean arms(int n){
        int temp=n;           // assigning the original no to the temporary no
        int b=0;

        while (n>0){
            int a=n%10;
            b=b+ (a*a*a);
            n=n/10;
        }
        return (b==temp);        //returning a function through boolean expression
    }
}
