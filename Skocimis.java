import java.util.Scanner;

public class Skocimis{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = b - a > c - b ? b - a - 1 : c - b - 1;
        System.out.println(result);
      }
    }