import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int op = sc.nextInt();

        int[] startLoc = new int[n];
        for(int i = 0; i < n; i++) {
            startLoc[i] = sc.nextInt();
        }

        int operation;
        int A;
        int B;
        int result;
        for(int i = 0; i < op; i++) {
            operation = sc.nextInt();
            if(operation == 1) {
                startLoc[sc.nextInt() -1] = sc.nextInt();
            } else {
                A = startLoc[sc.nextInt() - 1];
                B = startLoc[sc.nextInt() - 1];
                result = A >= B ? A - B: B - A;
                System.out.println(result);
            }
        }

    
    }
}
