package codewars;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (desired > principal) {
            principal = taxFormula(principal, interest, tax);
            years++;
        }
        return years;
    }

    private static double taxFormula(double principal, double interest, double tax) {
        return principal + (principal * interest) - (principal * interest * tax);
    }
}