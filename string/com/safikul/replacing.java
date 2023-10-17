package com.safikul;
import java.util.*;
public class replacing {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the size of the string ");
        int size= in.nextInt();

        String[] a=new String[size];

        //taking the input of the string
        for (int i = 0; i < size; i++) {
                 a[i] = in.next();
        }
        //replacing the desire character with the new one
        String result="";
        for (int i = 0; i < size; i++) {
            result+=a[i].replace('e','i')+" ";
        }
        //printing the result of the modified String
        System.out.println(result);


    }
}
