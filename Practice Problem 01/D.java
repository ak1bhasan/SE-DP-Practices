import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int mx = 1, current = 1;
        for( int i = 1; i < s.length(); i++ ) {
            if( s.charAt(i) == s.charAt(i - 1) ) current++;
            else current = 1;

            if(current > mx ) mx = current;
        }

        System.out.println(mx);

    }
}
