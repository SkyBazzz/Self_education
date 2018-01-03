package codeforces;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double n = scanner.nextInt();
            double m = scanner.nextInt();
            double a = scanner.nextInt();

            System.out.println((long) (Math.ceil(n / a) * Math.ceil(m / a)));
        }
    }
}