public class Recursion {
    public static void main(String[] args) {
        /* Define recursion:
            Breaking down complicated code into simpler, easier to understand code.
        */

        countDown(10);
        System.out.println("");
        countWhile(10);
        System.out.println("");
        System.out.println(sum(10));

    }

    public static void countDown(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countWhile(int number) {
        while(number >= 0) { // recursion???
            System.out.println(number);
            number -= 1;
        }
    }

    public static int sum(int n) {
        if (n>0) {
            return n + sum(n-1);
        } return n;
    }
}
