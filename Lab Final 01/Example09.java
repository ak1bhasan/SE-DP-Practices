import java.util.Scanner;
public class Example09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] c = new char[n];

        for( int i = 0; i < n; i++ ) {
            c[i] = sc.next().charAt(0);
            c[i] = Character.toUpperCase(c[i]);
        }
        for( char u : c ) System.out.print(u + " ");
    }
}
