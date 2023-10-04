package com.safikul;
import java.util.Scanner;
public class alphabetcase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // taking the character value
        System.out.print("Enter the character ");
        char ch = input.next().trim().charAt(0);
        System.out.println("the first character is "+ ch);


        // alphabet case checking
        if(ch>='a' && ch<='z'){
            System.out.print("And the first character is in Smaller Case");
        }
        else
            System.out.print("And the first character is in Upper case");
    }
}
