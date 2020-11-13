import java.util.Scanner;

public class Hangman{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray();
        char[] alfabet = sc.nextLine().toCharArray();
        int components = 0;
        int charactersLeft = word.length;
        boolean charWasFound = false;;
        for(int i = 0; i < alfabet.length; i++) {
            charWasFound = false;
            if(components == 10) {
                break;
            }
            for(int j = 0; j < word.length; j++) {
                if(alfabet[i] == word[j]) {
                    charactersLeft--;
                    charWasFound = true;
                }
            }
            if(charWasFound == false) {
                components++;
            }
        }

        if(charactersLeft == 0) {
            System.out.print("WIN");
        } else {
            System.out.print("LOSE");
        }
    }
}