package array;

public class Sumofarray {
    public static void main(String[] args) {
        int[] array ={2,3,23,3};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.print("The sum of the array is: "+ sum);
    }
}
