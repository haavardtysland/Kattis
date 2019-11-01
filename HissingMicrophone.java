
import java.util.*;

class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] characters = text.toCharArray();
        int count = 0;
        char s = 's';

        for (int i = 1; i < text.length(); i++) {
            if (characters[i] == s && characters[i] == characters[i-1]){
                count++;
            }
        }
        if (count>0) {
            System.out.println("hiss");
        }
        else {
            System.out.println("no hiss");
        }
    }
}