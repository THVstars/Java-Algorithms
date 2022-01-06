public class CaptureRook {
    public static void main(String[] args) {
        System.out.println(canCapture(new String[] {"C6", "C9"}));
    }

    public static boolean canCapture(String[] rooks) {
        // System.out.println(rooks[0].charAt(1));
        if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1)) {
            return true;
        } return false;
    }
}