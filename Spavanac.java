
import java.util.*;

class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b >=45) { 
            b = b-45;
        } else {
            if (a == 0) {
                a = 23;
                b = b + 15;
            } else {
                a = a - 1;
                b = b + 15;
            }
        }
      System.out.println(a + " " + b);
    }
}