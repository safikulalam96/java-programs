package com.safikul;

public class insertion {
    public static void main(String[] args) {
        int arr[]={23,56,11,64,2,5};

        //outer loop
        for (int i = 0; i < arr.length; i++) {

            int key=arr[i];
            int j=i-1;

            //checking the sorted array with the unsorted digit
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j]; //shifting the larger number towards right side
                j--;
            }
            arr[j+1]=key;
        }
        // printing the sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
