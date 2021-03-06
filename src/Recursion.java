public class Recursion {
    public static void main(String[] args) {
        /* Define recursion:
            Breaking down complicated code into simpler, easier to understand code. Method must call itself.
        */

        countDown(10);
        System.out.println("");
        countWhile(10);
        System.out.println("");
        System.out.println(sum(10));
        System.out.println("");
        System.out.println(factorial(5));
        System.out.println("");
        System.out.println(fibonacci(10));
        System.out.println("");
        System.out.println(addUp(10));

    }

    public static void countDown(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countWhile(int number) {
        while(number > -1) { // Recursion??? Must call method/function within itself.
            System.out.println(number);
            countWhile(number-1);
            break;
        }
    }

    public static int sum(int n) {
        if (n>0) {
            return n + sum(n-1);
        } return n;
    }

    public static int factorial(int num) {
        while (num > 1) {
            return num * factorial(num-1);
        } return 1; // No break needed because I'm not printing anything within the method / there's a return. Putting a different number here changes the result! 1 = 120, 10 = 1200.
    }

    public static int fibonacci(int n) {
        if (n==0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    public static int addUp(int num) {
        if (num > 0) {
            return num + addUp(num - 1);
        } return num;
    }
}
