import java.util.Scanner;
class invertedpyramid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (1 * i ); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}