import java.util.Scanner;

public class BreakingBranches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = 0; //Keeping track of the winner, even number is Alice, odd is Bob
        int part1 = 0;
        int part2 = 0;
        while (length >= 2) {
            if(length%2 == 0) 
            if(length != 2) {
                count++;
            }
            length = (length + 1) / 2; //length + 1 so we make sure it rounds up
        }
        if (count % 2 == 0) {
            System.out.println("Alice");
            System.out.println(length);
        } else {
            System.out.println("Bob");
        }
    }
}
