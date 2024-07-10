import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter Second number:");
        b = sc.nextInt();
        System.out.println("Enter your choice:");
        ch= sc.nextInt();
        switch (ch){
            case 1:
                int add = a+b;
                System.out.println(add);
                break;
            case 2:
                int sub = a-b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a*b;
                System.out.println(mul);
                break;
            case 4:
                int div = a/b;
                System.out.println(div);
                break;
            default:
                System.out.println("invalid choice");
                break;

        }
    }
}
