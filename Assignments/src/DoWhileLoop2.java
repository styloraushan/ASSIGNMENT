import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print table:");
        num = sc.nextInt();
        int i=1;
        while ( i<=10){
            System.out.println(num +"*" + i+"=" +num*i);
            i++;
        }
    }
}