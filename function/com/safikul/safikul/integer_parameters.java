package com.safikul.safikul;

import  java.util.Scanner;
public class integer_parameters {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the two no.s ");
        int a= in.nextInt();
        int b=in.nextInt();
        int numbers = num(a,b);
        System.out.println("The sum is : "+numbers);
    }
    static int num(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }
}
