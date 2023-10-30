public class sum {
    public static void print(int i, int j, int sum){

        if(i==j){
            sum+=i;
            System.out.print("The sum of the number is: "+sum);
            return;
        }
        sum+=i;
        // recalling the function with the increment and sum
        print(i+1,j,sum);

    }
    public static void main(String[] args) {
        int sum=0;
        print(1,10,sum);
    }
}
