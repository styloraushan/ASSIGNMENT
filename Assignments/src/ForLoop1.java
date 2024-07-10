//Print Table

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print table:");
        num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num +"*" + i+"=" +num*i);
        }
    }
}
