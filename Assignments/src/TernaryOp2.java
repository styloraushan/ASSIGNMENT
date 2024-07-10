import java.util.Scanner;
public class TernaryOp2 {

    public static void main(String[] args) {
        int a = 56;
        int b = 76;
        int c = 9;


        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is " + max);
    }
}
