import java.util.Scanner;

public class DoWhileLoop3 {

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
                do {
                    int j = 1;
                    do {
                        System.out.print("* ");
                        j++;
                    } while (j <= i);
                    System.out.println();
                    i++;
                } while (i <= size);
                break;

            case 2:

                i = 1;
                do {
                    int j = 1;
                    do {
                        System.out.print("* ");
                        j++;
                    } while (j <= size);
                    System.out.println();
                    i++;
                } while (i <= size);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }
}
