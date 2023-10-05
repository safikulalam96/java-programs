package com.safikul;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation to calculate (+ , - , * , % , /) ");



        while(true) {
            // taking the inputs
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op =='*' || op=='%' || op=='/') {
                System.out.println("Enter the value of a ");
                int a = input.nextInt();
                System.out.println("Enter the value of b ");
                int b = input.nextInt();



                // performing the operation
                if(op=='+'){
                    System.out.println("The Answer is "+ (a+b));
                }
                if(op=='-'){
                    System.out.println("The Answer is "+(a-b));
                }
                if(op=='*'){
                    System.out.println("The Answer is "+(a*b));
                }
                if(op=='%'){
                    System.out.println("The Answer is "+(a%b));
                }
                if(op=='/') {
                    // checking for undefined no
                    if (b != 0) {
                        System.out.println("The Answer is " + (a / b));
                    } else
                        System.out.println("Not Defined");
                }
            }
            else
                System.out.println("Your input is Incorrect");
        }
    }
}
