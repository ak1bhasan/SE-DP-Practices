import java.util.Scanner;

public class YouDo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;

        char[] c = new char[n];

        for( int i = 0; i < n; i++ ) {
            c[i] = sc.next().charAt(0);
        }

        System.out.print(c[0] + " " + c[n - 1]);

    }
}
