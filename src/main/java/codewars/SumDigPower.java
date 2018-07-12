package codewars;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();

        for (long i = a; i < b; i++) {
            if (isEqualToPowersSum(i)) {
                list.add(i);
            }
        }

        return list;
    }

    private static boolean isEqualToPowersSum(long n) {
        long sum = 0;
        String numString = String.valueOf(n);

        for (int i = 0; i < numString.length(); i++) {
            int digit = Integer.parseInt(numString.charAt(i) + "");
            sum += Math.pow(digit, i + 1);
        }

        return n == sum;
    }
}