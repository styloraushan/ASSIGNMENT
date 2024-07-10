import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int num = sc.nextInt();
        long fact;
        fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
