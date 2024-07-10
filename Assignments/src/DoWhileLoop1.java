import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int num = sc.nextInt();
        long fact;
        fact = 1;
        int i=1;
do{
    fact *= i;
    i++;
}
        while (i <= num);
        System.out.println(fact);
    }
}