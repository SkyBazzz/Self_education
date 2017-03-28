package codewars;

import java.util.Arrays;

class Xbonacci {
    double[] tribonacci(double[] s, int n) {

        if (n == 0) {
            return new double[]{};
        }
        double[] total = Arrays.copyOf(s, n);
        for (int i = s.length; i < n; i++) {
            total[i] = total[i - 1] + total[i - 2] + total[i - 3];
        }
        return total;
    }
}
