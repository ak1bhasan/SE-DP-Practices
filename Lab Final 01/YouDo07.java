import java.util.Scanner;

public class YouDo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        String[] country = new String[n];

        for( int i = 0; i < n; i++ ) {
            country[i] = sc.next();
            System.out.print(country[i] + " ");
        }



    }
}


