package com.safikul;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        addition();
    }
    static  void addition(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first no ");
        int a=input.nextInt();
        System.out.println("Enter the second no ");
        int b=input.nextInt();
        int c=a+b;
        System.out.println("The sum of the two no is :  "+ c);

    }
}

