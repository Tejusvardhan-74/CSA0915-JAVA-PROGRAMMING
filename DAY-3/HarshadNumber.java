import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        if (isHarshadNumber(userInput)) {
            System.out.println(userInput + " is a Harshad number.");
        } else {
            System.out.println(userInput + " is not a Harshad number.");
        }

        scanner.close();
    }

    static boolean isHarshadNumber(int num) {
        // Convert the number to a string to iterate through its digits
        String numStr = Integer.toString(num);

        // Calculate the sum of the digits
        int digitSum = 0;
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            digitSum += digit;
        }

        // Check if the number is divisible by the sum of its digits
        return num % digitSum == 0;
    }
}
