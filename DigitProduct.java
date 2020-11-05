import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitProduct(n));
    }

    public static int digitProduct(int n) {
        if(n < 10 && n > 0) {
            return n;
        } else {
        int[] digit = toIntArray(n);
        int result = 1;
        for(int i = 0; i < digit.length; i++) {
            if(digit[i] != 0) {
                result = result*digit[i];
            }
        }
        return digitProduct(result);
        }
    }

    public static int[] toIntArray(int n) {
        String test = Integer.toString(n);
        int[] digit = new int[test.length()];
        for(int i = 0; i < test.length(); i++) {
            digit[i] = test.charAt(i) - '0';
        }
        return digit;
    }
}
