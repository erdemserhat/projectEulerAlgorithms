
public class SixthProblem {

    /*
     * 2520 is the smallest number that can be divided by each of the numbers from 1
     * to 10 without any remainder. What is the smallest positive number that is
     * evenly divisible by all of the numbers from 1 to 20?
     */

    public static void main(String[] args) {
        boolean control = true;
        int i;
        for (i = 2520; control; i++) {

            if (i % 11 != 0 || i % 12 != 0 || i % 13 != 0 || i % 14 != 0 || i % 15 != 0 || i % 16 != 0 || i % 17 != 0
                    || i % 18 != 0 || i % 19 != 0 || i % 20 != 0) {

                continue;

            } else
                control = false;

        }
        System.out.println(i);

    }

}
