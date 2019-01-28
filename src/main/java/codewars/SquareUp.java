package codewars;

public class SquareUp {

    public static int[] squareUp(int n) {
        //Code the heck out of this.
        int[] result = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            int value = n - i % n;
            boolean fill = value <= (i / n + 1);
            result[i] = fill ? value : 0;
        }

        return result;
    }
}
