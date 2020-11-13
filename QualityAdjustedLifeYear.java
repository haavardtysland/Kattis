import java.util.Scanner;

public class QualityAdjustedLifeYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int periods = sc.nextInt();
        double average = 0;
        double years = 0;
        double result = 0;
        for(int i = 0; i < periods; i++) {
            average = sc.nextDouble();
            years = sc.nextDouble();
             result += average*years;
        }
        System.out.println(result);
    }
}