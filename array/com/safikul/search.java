package array;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner ex= new Scanner(System.in);
        int s=ex.nextInt();
        int [] array={24,34,6,134,45,0};
        int cont=0;

        for (int i = 0; i < array.length; i++) {
            if (s==array[i]){
                System.out.print(array[i]+" is stored at "+i);
                cont++;
            }
        }
        if (cont==0){
            System.out.println("Not Found the element that you are looking");
        }
    }
}
