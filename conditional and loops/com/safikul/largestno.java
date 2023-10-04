package com.safikul;
import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        //taking the values of a b c
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of a:-  ");
        int a= input.nextInt();
        System.out.println("Enter the value of b-  ");
        int b= input.nextInt();
        System.out.println("Enter the value of c:-  ");
        int c= input.nextInt();

        //comparing the values of a b c
        if (a>b &&a>c){
            System.out.print(a+" is the largest of all the numbers");
        }
        else if (b>a && b>c){
            System.out.print(b+" is the largest of all the numbers");
        }
        else
            System.out.printf(c+" is the largest of all the numbers");
    }
}
