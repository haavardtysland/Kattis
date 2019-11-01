import java.util.*;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int input = sc.nextInt();
        int total = max;
        for (int i = 0; i < input; i++) {
            int tall = sc.nextInt();
            if (tall < max) {
                total+=(max-tall);
            } else if (tall==max) {
            
            } else {
                total-=(tall-max);
            }
        }
        System.out.println(total);
    }
}