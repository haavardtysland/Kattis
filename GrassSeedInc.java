import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        int lawns = sc.nextInt();
        double total = 0;
        double width = 0;
        double length = 0;
        for(int i = 0; i < lawns; i++) {
            width = sc.nextDouble();
            length = sc.nextDouble();
            total+=width*length;
        }
        System.out.println(total*cost);
    }
}
