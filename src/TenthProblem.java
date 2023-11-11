

import java.math.BigInteger;

public class TenthProblem {

    /*
     * n! means n × (n − 1) × ... × 3 × 2 × 1
     *
     * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
     * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
     *
     * Find the sum of the digits in the number 100!
     */

    private static BigInteger Factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        return number.multiply(Factorial(number.subtract(BigInteger.ONE)));
    }

    public static void main(String... args) {
        //System.out.println(Factorial(BigInteger.valueOf(10)));
        //System.out.println(Factorial(10));
        //System.out.println(SummationOfDigists(BigInteger.valueOf(123)));
        //System.out.println(SummationOfDigists(Factorial(100)));
        System.out.println(SummationOfDigists(Factorial(BigInteger.valueOf(100))));

    }

    // Second Method

    private static BigInteger Factorial(int number) {
        BigInteger factornumber = new BigInteger("1");
        for (int i = 1; i <= number; i++) {

            factornumber = factornumber.multiply(BigInteger.valueOf(i));

        }

        return factornumber;

    }

    private static BigInteger SummationOfDigists(BigInteger factornumber) {
        BigInteger total = new BigInteger("0");
        while (factornumber.compareTo(BigInteger.ZERO) != 0) {
            total = total.add(factornumber.mod(BigInteger.TEN));
            factornumber = factornumber.divide(BigInteger.TEN);

        }

        return total;

    }

}
