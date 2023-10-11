package com.safikul;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int [] array= new int[5];
        System.out.print("Enter the numbers ");

        //taking input through for loop
        for (int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }

        // printing the input array
        System.out.println("The entered numbers are till range are: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
