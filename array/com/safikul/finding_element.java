package com.safikul;
import java.util.*;
public class finding_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the numbers of row: ");
        int r = in.nextInt();
        System.out.print("Enter the numbers of row: ");
        int c = in.nextInt();
        System.out.println("Enter the number to check it presence");
        int x = in.nextInt();

        int[][] array = new int[r][c];


        System.out.println("Enter the Array ");
        //inputs
        for (int row = 0; row < r; row++) {

            for (int col = 0; col < c; col++) {
                array[row][col] = in.nextInt();

            }

        }

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (x == array[row][col]) {
                    System.out.println(x + " is present in ("+ row+ ","+ col+")");
                }

            }


        }
    }
}
