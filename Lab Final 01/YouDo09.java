import java.util.*;
public class YouDo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] letter = new char[n];

        for( int i = 0; i < n; i++ ) {
            letter[i] = sc.next().charAt(0);
            letter[i] = Character.toLowerCase(letter[i]);
        }

        for( char c : letter ) System.out.print(c + " ");

    }
}
