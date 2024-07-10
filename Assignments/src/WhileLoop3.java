import java.util.Scanner;

public class WhileLoop3 {

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

                int i = 1;
                while (i <= size) {
                    int j = 1;
                    while (j <= i) {
                        System.out.print("* ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                break;

            case 2:

                i = 1;
                while (i <= size) {
                    int j = 1;
                    while (j <= size) {
                        System.out.print("* ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        
    }
}
