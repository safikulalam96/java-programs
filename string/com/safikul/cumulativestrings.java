package com.safikul;
import java.util.Scanner;
public class cumulativestrings {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the size of the string ");
        int size= in.nextInt();
        String [] a= new String[size];

        int count=0;
        System.out.print("Enter the String in form of size mentioned above ");
        for (int i = 0; i < size; i++) {
            a[i]=in.next();
            count+= a[i].length();
        }
        System.out.print("The cumulative count of the string is: "+count);
    }
}
