import java.util.*;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        int points = (int)Math.pow(2, iterations) + 1; //2^(iterations) + 1
        System.out.println(points*points); //points^2
    }
}

