import java.util.Scanner;
import java.util.ArrayList;

public class standarddeviation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values to calculate the standard deviation for: ");
        int n = scanner.nextInt();

        ArrayList<Double> values = new ArrayList<Double>();
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextDouble());
        }

        double mean = calculateMean(values);
        double variance = calculateVariance(values, mean);
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println("Standard Deviation: " + standardDeviation);

        scanner.close();
    }

    public static double calculateMean(ArrayList<Double> values) {
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum / values.size();
    }

    public static double calculateVariance(ArrayList<Double> values, double mean) {
        double variance = 0;
        for (Double value : values) {
            variance += Math.pow(value - mean, 2);
        }
        return variance / values.size();
    }
}