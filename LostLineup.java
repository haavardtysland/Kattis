import java.util.Scanner;

public class LostLineup {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int people = sc.nextInt() - 1;
            int[] order = new int[people + 1];
            order[0] = 1;
            int temp = 0;
            int count = 1;
            for(int i = 0; i < people; i++) {
                count++;
                temp = sc.nextInt();
                order[temp + 1] = count;
            }
            for(int result : order) {
                System.out.println(result);
            }
    }
}
