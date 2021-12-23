public class VideoLengthInSeconds {
    public static void main(String[] args) {
        System.out.println(minutesToSeconds("21:01"));
    }
    public static int minutesToSeconds(String tm) {
        String[] arr = tm.split(":"); // converts to an array and splits the values at the colon.
        int minutes = Integer.parseInt(arr[0]); // converts string to int, so that we can complete mathematical calculations on it.
        int seconds = Integer.parseInt(arr[1]);
        if (seconds >= 60) {
            return -1;
        }
        return (minutes*60)+seconds;
    }
}