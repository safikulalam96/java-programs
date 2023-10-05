package com.safikul;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number to reverse:-  ");
        int no=input.nextInt();
        int rev=0;
        while (no>0){
            int a=no%10;
            no=no/10;
            rev=rev*10+a;
        }
        System.out.println(rev);
    }
}
