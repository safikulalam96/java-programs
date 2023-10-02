package com.Test;

import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a= input.nextInt();
        System.out.println("the value of a is "+a);

        System.out.println("Enter the second no: ");
        int b = input.nextInt();
        System.out.println("the value of b is "+b);
        int c=a+b;
        System.out.println("the sum of a and b "+c);

    }
}
