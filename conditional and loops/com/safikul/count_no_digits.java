package loop_problems;

public class count_no_digits {
    public static void main(String[] args) {
        int a=3432;
        int count = 0;
        while(a>0) {
            a = a / 10;
            count++;
        }
        System.out.println("the number of digits is: "+count);
    }
}
