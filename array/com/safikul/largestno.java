package array;

public class largestno {
    public static void main(String[] args) {
        int [] arr={23,6,2,4,6,7};
        int largest=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.print(largest);
    }
}
