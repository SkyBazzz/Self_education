package codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = scanner.nextInt();

            if (4 <= i && i <= 100) {
                if (i % 2 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
