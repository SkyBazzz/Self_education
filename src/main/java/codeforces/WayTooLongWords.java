package codeforces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = Integer.parseInt(scanner.nextLine());
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < i; j++) {
                String word = scanner.nextLine();
                if (word.length() > 10) {
                    stringBuilder.append(word.charAt(0)).append(word.length() - 2).append(word.charAt(word.length() - 1)).append("\n");
                } else {
                    stringBuilder.append(word).append("\n");
                }
            }
            System.out.println(stringBuilder);
        }
    }
}
