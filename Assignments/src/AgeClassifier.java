import java.util.Scanner;

public class AgeClassifier {

    public int ages(int age) {

        if (age <= 0) {
            System.out.println("invalid age");
        } else if (age <= 12) {
            System.out.println("You are a child now");
        } else if (age <= 19) {
            System.out.println("You are a Teenager");
        } else if (age <= 64) {
            System.out.println("Ypu are Adult");
        } else {
            System.out.println("Senior citizen");
        }
        return age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age:");

        int age = sc.nextInt();

        AgeClassifier Classifier = new AgeClassifier();

        Classifier.ages(age);

    }
}