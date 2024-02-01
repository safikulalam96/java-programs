package array;
import java.util.Scanner;
public class occurance {

    public static int findOccurrence(int[] arr, int num) {
        int count = 0;
        for (int element : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check its occurrence in the array: ");
        int check = scanner.nextInt();

        int[] array = {5, 6, 4, 5, 6, 5};

        int occurrenceCount = findOccurrence(array, check);

        System.out.println("The total number of occurrences is: " + occurrenceCount);

    }
}
