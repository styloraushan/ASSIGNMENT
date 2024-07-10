import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color for know the traffic action:");
        color = sc.nextLine();
        switch(color){
            case "red":
                System.out.println("Stop the car");
                break;
            case "yellow":
                System.out.println("wait for green ligt");
                break;
            case "green":
                System.out.println("ready to go");
                break;
            default:
                System.out.println("invalid color");

        }
    }

}
