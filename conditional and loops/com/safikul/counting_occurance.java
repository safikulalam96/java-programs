package com.safikul;
import java.math.BigInteger;
import java.util.Scanner;
public class counting_occurance {
    public static void main(String[] args) {
        // taking inputs
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your no to check it's occurance ");
        int my_no=input.nextInt();
        System.out.println("Enter the number ");
        int the_no=input.nextInt();

        int temp=the_no;
        int count=0;

        while (the_no>0){
            int b=the_no%10;
            the_no=the_no/10;
            if(b==my_no){
                count++;
            }
        }
        System.out.println(my_no+" is "+count+ " times present in "+ temp);

    }
}
