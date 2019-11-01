import java.util.*;

public class IdentifyingMapTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        int x = 0, y = 0;
        int factor = 1 << (input.length() - 1);
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1' ) {
                x+=factor;
            }
            if (input.charAt(i) == '2' ) {
                y+=factor;
            }
            if (input.charAt(i) == '3') {
                x+=factor;
                y+=factor;
            }
            factor /=2;
        }
        System.out.println(input.length() + " " + x + " " + y);
    }
}