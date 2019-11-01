import java.util.*;

public class Avion {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        for (int i = 1; i < 6; i++) {

            String text = sc.nextLine();

            if (text.contains("FBI")) {
                System.out.println(i);
                check = true;
            } 
        }
        if (check==false){
            System.out.println("HE GOT AWAY!");
        }
    }
}