package courses;
import java.util.Arrays;

public class FirstFiftyPrimes {

    public static void main(String[] args) {
        int count = 50; // The number of prime numbers to find
        int[] primeNumbers = getFirstNPrimes(count);
        System.out.println("The first 50 prime numbers are: " + Arrays.toString(primeNumbers));
    }

    /**
     * Method to find the first N prime numbers and return them in an array.
     * @param n The number of prime numbers to find.
     * @return An array containing the first N prime numbers.
     */
    public static int[] getFirstNPrimes(int n) {
        int[] primes = new int[n];
        int count = 0; // Count of prime numbers found so far
        int number = 2; // The number to be tested for primality

        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        return primes;
    }

    /**
     * Method to check if a number is prime.
     * A number is prime if it is greater than 1 and has no positive divisors other than 1 and itself.
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check for divisors from 2 up to the square root of num for efficiency.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
