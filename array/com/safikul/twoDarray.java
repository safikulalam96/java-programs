package com.safikul;
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);


        System.out.print("Enter the numbers of row: ");
        int r= in.nextInt();
        System.out.print("Enter the numbers of row: ");
        int c= in.nextInt();

        int[][] array=new int[r][c];

        //inputs
        for (int row=0;row<r;row++){

            for (int col=0;col<c;col++){
                array[row][col]=in.nextInt();
            }
        }


        for (int row=0;row<r;row++){

            for (int col=0;col<c;col++){
                System.out.print(array[row][col]+ " ");
            }
            System.out.println("");
        }
    }
}
