

import java.math.BigInteger;

public class FifthProblem {

    // The prime factors of 13195 are 5, 7, 13 and 29.

    // What is the largest prime factor of the number 600851475143 ?

    public static void main(String[] args) {
        BigInteger number = new BigInteger("600851475143");
        BigInteger divider = new BigInteger("2");
        int a = number.compareTo(BigInteger.ONE);
        while (a != 0) {

            if (number.mod(divider) == BigInteger.ZERO) {
                number = number.divide(divider);
                System.out.println(divider);

            } else
                divider = divider.add(BigInteger.ONE);

            a = number.compareTo(BigInteger.ONE);

        }

    }

}
