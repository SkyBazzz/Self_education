package codewars;

import java.util.Arrays;

class Average {
    static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }
}
