class Countdown {
    void start() {
        for( int i = 5; i >= 1; i-- ) System.out.println(i);
        System.out.println("Go!");
    }
}

public class YouDo03 {
    public static void main(String[] args) {
        Countdown starter = new Countdown();
        starter.start();
    }
}
