class primenumbers {
public static void main(String[] args) {
    int limit = 50;
    System.out.println("Prime numbers between 1 and " + limit);
    for (int i = 2; i <= limit; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
}
private static boolean isPrime(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}
        }