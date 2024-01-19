package rains.com.recursion;

public class L001Pow {
    public static void main(String[] args) {
        var obj = new L001Pow();
        double res = obj.myPow(2, 10);
        System.out.println(res);
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return myPow2(x, n);
        // if (n < 0) {
        // n = -n;
        // }
        // return myPow2(x, n);
    }

    public double myPow2(double x, int n) {
        if (n <= 0) {
            return 1;
        }
        double half = myPow2(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
        // if (n == 0) {
        // return 1;
        // }
        // double part = myPow2(x, n - 1);
        // return part * x;
    }
}
