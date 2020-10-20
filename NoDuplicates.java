import java.util.Scanner;

public class NoDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] array = text.split(" ");
        String check = "yes";
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1 ; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    check = "no";
                }
            }
        }
    System.out.println(check);
    }
}