

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a pattern to print:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        int choice = sc.nextInt();

        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();

        switch (choice) {
            case 1:
                // Print Triangle

                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Print Square

                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;


            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
