public class TaylorSeries {
    public static double taylorSeries(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {
            term = term * x / i;
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.printf("Taylor Series approximation of e^%.1f with %d terms is: %.10f%n", x, n, taylorSeries(x, n));
    }
}
