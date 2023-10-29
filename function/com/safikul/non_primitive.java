package com.safikul;
import java.util.Arrays;
import java.util.Scanner;
public class non_primitive {
    public static void main(String[] args) {
        int[] arr={23,34,33,223,90};
        System.out.println("Before execution of the problem");
        System.out.println(Arrays.toString(arr));
        simple(arr);
        System.out.println("After execution of the problem");
        System.out.println(Arrays.toString(arr));
    }
    static void simple(int[] num){

        num[0]=2;
    }
}
