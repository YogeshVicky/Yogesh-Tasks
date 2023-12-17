public class mymath {
    public static double abs(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        double value = -10.5;
        double absoluteValue = abs(value);
        System.out.println("The absolute value of " + value + " is " + absoluteValue);
    }
}