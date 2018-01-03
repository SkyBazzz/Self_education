package codewars;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if (bounce >= 1 || h < 0 || bounce < 0 || window < 0 || h == window) {
            return -1;
        }
        int bounceDownTimes = 1;
        while (true) {
            h = h * bounce;
            if (h > window) {
                bounceDownTimes += 2;
            } else {
                break;
            }
        }

        return bounceDownTimes;
    }
}
