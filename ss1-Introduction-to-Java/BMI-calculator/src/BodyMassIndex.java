import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("Your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your bmi is: " + bmi);
        if (bmi < 18) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are normal");
        } else if (bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}
