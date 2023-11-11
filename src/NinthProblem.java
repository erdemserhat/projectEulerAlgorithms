

import java.math.BigInteger;

public class NinthProblem {

    /*
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     *
     * Find the sum of all the primes below two million.
     */

    private static Boolean IsPrime(int number) {
        if (number == 1)
            return false;
        int counter = 0;
        var sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {

            if (number % i == 0)
                counter++;
            if (counter > 0)
                return false;

        }

        return true;

    }

    private static BigInteger Summation(int size) {
        BigInteger total = new BigInteger("0");
        for (int i = 1; i <= size; i++) {

            if (IsPrime(i))
                total = total.add(BigInteger.valueOf(i));

        }

        return total;

    }

    public static void main(String... args) {
        System.out.println(Summation(2_000_000));

    }

}
