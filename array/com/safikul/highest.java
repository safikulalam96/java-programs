package com.safikul;

import java.util.Arrays;

public class highest {
    public static void main(String[] args) {
        int [] arr= { 12,134,2,53,23};

        int a= large(arr);     // Function call
        System.out.println("The largest number in the Array is "+ a);
    }

    //Comparing the elements in the Given Array
    static int large(int[] arr){            // function Declaration
        //body of the function
        int maxval= arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
