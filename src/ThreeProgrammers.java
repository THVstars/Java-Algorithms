public class ThreeProgrammers {

    public static void main(String[] args) {
        System.out.println(programmers(30000, 50000, 100000));
    }

    public static int programmers(int one, int two, int three) {
        return Math.max(Math.max(one, two), three) - Math.min(Math.min(one, two), three);
    }
}
