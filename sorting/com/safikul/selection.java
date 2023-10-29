package com.safikul;

public class selection {

    public static void printingarray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int arr[]={99,56,21,44,18};

        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            //swapping after the every iteration after finding the smallest digit of all
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printingarray(arr);
    }
}
