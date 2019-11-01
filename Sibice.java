
import java.util.*;

class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int width = sc.nextInt();
        int heigth = sc.nextInt();
        double hyp = Math.sqrt((width*width) + (heigth*heigth));

       for (int i = 0; i < input; i++) {
            int match = sc.nextInt();
            if (match <= heigth || match <= hyp) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
       }
    }
}