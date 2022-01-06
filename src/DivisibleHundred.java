public class DivisibleHundred {
    public static void main(String[] args) {
        System.out.println(divisible(1000000));
    }

    public static boolean divisible(int num) {
        boolean hundredDivisible = false;
        if (num % 100 == 0) { // % IS THE REMAINDER OPERATOR.
            hundredDivisible = true;
        } return hundredDivisible;
    }
}
