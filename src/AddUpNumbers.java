public class AddUpNumbers {
    public static void main(String[] args) {
        System.out.println(addUp(7));
    }

    public static int addUp(int num) {
        int added = 0;
        for (int i = 0; i < num; i++) {
            added += i;
        } return added + num;
    }
}
