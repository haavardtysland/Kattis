import java.util.*;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            int tall = sc.nextInt();
            if (tall % 2 == 0) {
                System.out.println(tall + " is even");
            } else {
                System.out.println(tall + " is odd");
            }
        }
    }
}