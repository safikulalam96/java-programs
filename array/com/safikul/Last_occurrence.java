package array;

import java.util.Scanner;

public class Last_occurrence {
    public static int lastOccurrence(int[] arr, int num) {
        int largest=0;
        for (int i=0;i<arr.length;i++) {
            if (num == arr[i]) {
                largest=i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int check = scanner.nextInt();

        int[] array = {5, 6, 4, 5, 6, 5};

        int occurrenceCount = lastOccurrence(array, check);

        System.out.println("The last occurrence of "+check+" is at index no " + occurrenceCount);

    }
}
