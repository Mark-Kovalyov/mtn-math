package mayton.libs;

import java.math.BigInteger;

public class MtnMath {

    private MtnMath() {
        // No instance
    }

    public static int gcd(int a, int b) {
        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    }

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (!b.equals(BigInteger.ZERO))
            return gcd(b, a.mod(b));
        else
            return a;
    }

    public static BigInteger effective_gcd(BigInteger a, BigInteger b) {
        // TODO: From Alexander Stepanoff
        return BigInteger.ZERO;
    }

    public static int lcm(int a,int b) {
        return (a * b) / gcd(a,b);
    }

    public static BigInteger lcm(BigInteger a,BigInteger b) {
        return a.multiply(b).divide(gcd(a,b));
    }

    public static int eulerFunction(int a) {
        // TODO:
        return 0;
    }
}
