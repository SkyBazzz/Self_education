package codeforces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) throws Exception {
        int[] scores = new int[50];
        int noOfStudents;
        int kthPlace;
        int counter = 0;
        try (Scanner sc = new Scanner(System.in)) {
            noOfStudents = sc.nextInt();
            kthPlace = sc.nextInt();
            kthPlace = kthPlace - 1;

            for (int iterator = 0; iterator < noOfStudents; iterator++) {
                scores[iterator] = sc.nextInt();
            }
            if (scores[kthPlace] > 0) {
                for (int i = kthPlace + 1; i < noOfStudents && scores[kthPlace] == scores[i]; i++) {
                    counter++;
                }
                System.out.println(counter + kthPlace + 1);
            } else {
                for (int iterator = 0; iterator < kthPlace && scores[iterator] > 0; iterator++) {
                    counter++;
                }
                System.out.println(counter);
            }
        }
    }
}
