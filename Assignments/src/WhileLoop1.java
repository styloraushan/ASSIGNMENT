import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int num = sc.nextInt();
        long fact;
        fact = 1;
        int i=1;

        while (i <= num){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
