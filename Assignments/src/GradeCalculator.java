import java.util.Scanner;
public class GradeCalculator {

public String  gradeClassifier(int Marks) {

    if (Marks >= 85) {
        return "You got A grade";
    }
    else if (Marks >= 65 && Marks < 85) {
        return "You got B grade";
    }

    else if (Marks >= 50 && Marks < 65)

    {
        return "You got c grade";
    }
    else if (Marks >= 30 && Marks < 50)
    {
        return "You got d grade";
    }
    else
    {
        return "fail";
    }

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int Marks = sc.nextInt();

        GradeCalculator grade =new GradeCalculator();
        String result=grade.gradeClassifier(Marks);
        System.out.println(result);

    }
}


