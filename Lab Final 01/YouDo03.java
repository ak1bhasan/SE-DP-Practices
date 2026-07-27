import java.util.Scanner;

public class YouDo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] colour = new String[n];

        for( int i = 0; i < n; i++ ) {
            colour[i] = sc.next();
        }

        System.out.println(colour[n - 1]);

    }
}
