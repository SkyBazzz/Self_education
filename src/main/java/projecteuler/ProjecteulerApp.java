package projecteuler;

import static java8.collections.lambdas_and_streams.delayed_initialization.Heavy.isPrime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProjecteulerApp {
    public static void main(String[] args) {
        System.out.println(specialPythagoreanTriplet());
    }

    private static int sumOfFilteredElements() {
        return createList().stream().filter(e -> e % 3 == 0 || e % 5 == 0).mapToInt(e -> e).sum();
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        return list;
    }

    private static int sumFibonacciList(int maxValueInFibonacciSequence) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        list.add(0);
        list.add(1);

        for (int i = 2; list.get(i - 1) < maxValueInFibonacciSequence; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
            if (list.get(i) % 2 == 0) {
                sum += list.get(i - 1) + list.get(i - 2);
            }
        }
        return sum;
    }

    private static int largestPrimeFactor() {
        BigInteger number = new BigInteger("600851475143");
        int maxValue = 0;
        Double doubleValue = number.doubleValue();

        for (int i = 1; i < Math.round(Math.sqrt(doubleValue)); i++) {
            if (doubleValue % i == 0 && isPrime(i)) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int sumSquareDifference() {
        int square = 0;
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            square += Math.pow(i, 2);
            sum += i;
        }
        return sum * sum - square;
    }

    private static int largestPalindromeProduct() {
        int longestPalindrome = 0;
        for (int i = 999999; i > 0; i--) {
            if (isPalindrome(i)) {
                for (int j = 999; j > 0; j--) {
                    if (i % j == 0 && i / j < 1000) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    private static boolean isPalindrome(int s) {
        return String.valueOf(s).equals(new StringBuilder(String.valueOf(s)).reverse().toString());
    }

    private static long stPrime(int stNumber) {
        int count = stNumber;
        int i = 1;

        while (count != 0) {
            i++;
            if (isPrime(i))
                count--;
        }
        return i;
    }

    private static long specialPythagoreanTriplet() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println("a = " + a + " b = " + b + " c = " + c);
                    return a * b * c;
                }
            }
        }
        throw new AssertionError("Not found");
    }
}