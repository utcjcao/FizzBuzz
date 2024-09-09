/**
 * Solve the FizzBuzz challenge.
 */

class FizzBuzz {

    public static void main(String[] args) {
        // for loop creates incremeter in the for loop
        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // variable types are defined preemptively
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        //java uses semicolons
        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            //print is now system.out.println
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");
        // instead of colon, we use {}
        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }

}
