import java.util.*;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int articles = sc.nextInt();
        double factor = sc.nextInt() - 0.99;
        double scientists = articles*factor;
        int result = (int) Math.ceil(scientists);
        System.out.println(result);
    }
}