package com.Test;
import java.util.Scanner;
public class temperature {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the temperature in °celcius to convert it to °fehrenheit ");
        float a=input.nextFloat();
        float b=(a*9/5)+32;
        System.out.printf("The temperature is "+b+" °fehrenheit");

    }
}
