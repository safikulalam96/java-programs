package com.safikul.safikul;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to check prime or not ");
        int no= in.nextInt();

        check(no);

    }
    static void  check(int pr){
        int i=1;
        int count=0;
        while(i<=pr){
            if(pr%i==0){
                count++;
            }
            i++;
        }
        if(count>2){
            System.out.println("Your number is a composite number");
        }
        else
            System.out.println("Your number is a prime number");
    }
}
