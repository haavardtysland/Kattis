import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sets = sc.nextInt();
        for(int i = 0; i < sets; i++) {
            int candles = 0;
            int k = sc.nextInt();
            int days = sc.nextInt();
            for(int j = 1; j < days + 1; j++) {
                candles += j + 1;
            }
            System.out.println(k + " " +  candles);
        }
    }
}