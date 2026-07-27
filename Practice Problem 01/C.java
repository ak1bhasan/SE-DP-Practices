import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int actual = 0;
        int sum = 0;
        for( int i = 1; i <= n; i++ ) actual += i;

        for( int i = 0; i < n - 1; i++ ) {
            int m = sc.nextInt();
            sum += m;
        }

        System.out.println(actual - sum);

    }
}
