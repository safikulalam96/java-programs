package com.safiikul;
import java.util.Scanner;
public class linear_searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //taking the input of 5 digits of Array from the user
        System.out.println("Enter the Array of 5 digits: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the number to check in the loop: ");
        int target = in.nextInt();
        int ans=searching(arr, target);
        System.out.println(ans);
    }

    static int searching(int[] arr, int finding) {

        if(arr.length==0){
            return -1;
        }
        //checking whether the number is present or not through the loop
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (finding == element) {
                return i; // will return the index of the found number
            }
        }
        return -1;
    }

}
