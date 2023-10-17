package com.safikul;
import java.util.*;
public class email {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter your email ");
       String email=in.next();

       String result ="";
        for (int i = 0; i < email.length(); i++) {

            if(email.charAt(i)=='@'){
                break;
            }
            else
                result+=email.charAt(i);
        }
        System.out.println(result);
    }
}
