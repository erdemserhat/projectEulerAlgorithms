

import java.util.Scanner;

public class ThirdProblem {

    //Problem :get two bounds from user and sort prime numbers in respective range from least to greatest then show how many prime numbers exist.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first border");
        int border1 = input.nextInt();
        System.out.println("Please enter the second border");
        int border2 = input.nextInt();
        boolean control;
        int sizeOfPrimeNumbers = 0;

        for (int i = border1; i <= border2; i++) {
            control = true;
            for (int k = 2; k <= (i / 2); k++) {

                if (i % k == 0)
                    control = false;

            }
            if (control && i != 1) {
                sizeOfPrimeNumbers++;

            }

        }
        System.out.println("Araliktaki asal sayi adedi: " + sizeOfPrimeNumbers);
        int[] primeNumbers = new int[sizeOfPrimeNumbers];
        int j = 0;

        for (int i = border1; i <= border2; i++) {
            control = true;
            for (int k = 2; k <= (i / 2); k++) {

                if (i % k == 0)
                    control = false;

            }
            if (control && i != 1) {
                primeNumbers[j] = i;
                j++;

            }

        }
        for (int i = 0; i < primeNumbers.length; i++) {

            System.out.println("Araliktaki " + (i + 1) + " . Asal Sayiniz : " + primeNumbers[i]);

        }

    }
}
