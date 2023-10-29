/* Calculating the bonus based on salary */
package com.safikul;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary to get the bonus ");
        float salary = input.nextFloat();
        if (salary <= 10000) {
            salary += 1000;
        } else if (salary > 10001 && salary < 20000) {
            salary += 2500;
        } else salary += 4400;
        System.out.print("Your new salary is : " + salary);
    }
}

