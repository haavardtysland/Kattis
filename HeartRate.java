import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        double min;
        double bpm;
        double max;
        for (int i = 0; i < cases; i++) {
            int b = sc.nextInt();
            double p = sc.nextDouble();
            bpm = (60*b)/p;
            min = bpm - 60/p;
            max = bpm + 60/p;
            System.out.println(min + " " + bpm + " " + max);
        }
    }
}