import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int k;
        for(int i = 0; i < n; i++) {
            k = sc.nextInt();
            if(k < 0) {
                result -= k;
            }
        }
        System.out.println(result);
    }
}
