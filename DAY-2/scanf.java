import java.util.Scanner;

public class scanf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's registration number: ");
        String registrationNumber = scanner.nextLine();

        System.out.print("Enter the student's result (e.g., A, B, C, D, or F): ");
        String result = scanner.nextLine();

        System.out.print("Enter the student's grade (e.g., A, B, C, D, or F): ");
        String grade = scanner.nextLine();

        System.out.print("Enter the student's percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}