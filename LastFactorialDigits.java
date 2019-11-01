import java.util.*;

public class LastFactorialDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int factor = sc.nextInt();
            int total = 1;
            for (int k = 1; k <= factor; k++) {
                total = total*k;
            
            }
            System.out.println(total%10);
        }
    }
}