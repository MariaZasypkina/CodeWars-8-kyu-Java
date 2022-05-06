
public class EasyLogs {

    public static double logs(double x, double a, double b) {
        return (Math.log(a) + Math.log(b)) / Math.log(x);
    }

    public static void main(String[] args) {
        double x = 10;
        double a = 2;
        double b = 3;

        System.out.println(logs(x,a,b));
    }
}