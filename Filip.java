import java.util.Scanner;

public class Filip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit1 = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());
        int digit2 = Integer.parseInt(new StringBuilder(sc.next()).reverse().toString());        int reverse1 = 0;
        if(digit1 > digit2) System.out.println(digit1);
        else System.out.println(digit2
        );
    }
}