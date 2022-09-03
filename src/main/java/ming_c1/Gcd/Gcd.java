package ming_c1.Gcd;

/**
 * get the greatest common divisor in two number
 */
public class Gcd {
    public static int getGcd(int p, int q) {
        int r = p % q;
        if (r == 0 ) return q;
        else return getGcd(q, r);
    }
}
