package com.safikul;
import java.util.Scanner;
public class Bubblesorting {

    public static void printingarray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Array after performing Bubble Sorting: ");
        int arr[]={23,8,45,5,76,67};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {

                //comparing the element of each iteration
                if(arr[j]>arr[j+1]){
                    //swapping the element
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        //using a function to print the sorted array
        printingarray(arr);
    }
}
