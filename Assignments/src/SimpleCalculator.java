import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers:");
        int num = sc .nextInt();
   if(num/2==0){
       System.out.println(num+"This is even number");
   }
   else {
       System.out.println(num+"This is odd number");
   }
    }
}
