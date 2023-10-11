package com.safikul.safikul;
import java.util.Scanner;
public class return_string {
    public static void main(String[] args) {
        String mssg=greet();
        System.out.print(mssg);
    }
    static String greet(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the message to print ");
        String mms=in.nextLine();
        return mms;

    }
}
