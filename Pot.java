import java.util.*;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int addends = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < addends; i++) {
            int x = sc.nextInt();
            int power = x % 10;
            int number = x / 10;
            sum += Math.pow(number, power);
        }
        System.out.println(sum);
    }
}