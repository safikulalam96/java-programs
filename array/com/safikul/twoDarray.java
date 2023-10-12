package com.safikul;
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);


        System.out.print("Enter the numbers of row: ");
        int r= in.nextInt();
        System.out.print("Enter the numbers of column: ");
        int c= in.nextInt();

        int[][] array=new int[r][c];

        System.out.println("Enter the Array ");

        //inputs
        for (int row=0;row<r;row++){

            for (int col=0;col<c;col++){
                array[row][col]=in.nextInt();
            }
        }

        //output
        for (int row=0;row<r;row++){

            for (int col=0;col<c;col++){
                System.out.print(array[row][col]+ " ");
            }
            System.out.println("");
        }
    }
}
