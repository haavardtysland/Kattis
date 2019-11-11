import java.util.*;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int thickness = 4;
        int result = 0;

        if((n-v) > n/2) {
            if( (n-h) > n/2 ) {
            result = thickness*(n-v)*(n-h);
            } else {
                result = thickness*(n-v)*h;
            }
        } else if ((n-v) <= n/2 ) {
            if( (n-h) > n/2 ) {
                result = thickness*v*(n-h);
                } else {
                    result = thickness*v*h;
                }
        }
        System.out.println(result);
        
    }
}