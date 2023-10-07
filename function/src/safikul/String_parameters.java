package src.safikul;
import java.util.Scanner;
public class String_parameters {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=in.nextLine();
        String Sentence= sen(name);
        System.out.println(Sentence);
    }
    static String sen(String safikul){
        String a="Hello "+ safikul;
        return  a;
    }
}
