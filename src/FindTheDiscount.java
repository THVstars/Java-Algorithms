public class FindTheDiscount {
    public static void main(String[] args) {
        System.out.println(discount(100, 20));
    }

    public static double discount(int price, int percentage) {
        return price*(100-percentage)/100;
    } // alternative solution: return price*((100-percentage)/100d); the d at the end stands for double so that it returns an actual number instead of 0.0 because an int divided by an int that results in a value less than 1, such as 0.5 for 50%, returns 0.0 in Java.
}
