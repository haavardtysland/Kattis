import java.util.Scanner;

public class JanitorTroubles{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double s = (a+b+c+d)/2;

        System.out.println(Math.sqrt((s-a)*(s-b)*(s-c)*(s-d)));
    }
}