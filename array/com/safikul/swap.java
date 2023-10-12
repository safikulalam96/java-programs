package com.safikul;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr= {2,34,45,78};
        System.out.println("before swapping" + Arrays.toString(arr));
        swapping(arr,1,3);
        System.out.println("After swapping" + Arrays.toString(arr));
    }
    static void swapping(int[] arr ,int index1 , int index2 ){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
