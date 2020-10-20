import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gunnar = 0;
        int emma = 0;
        while(sc.hasNext()) {
            for(int i = 0; i < 4; i++) gunnar += sc.nextInt();
            for(int i = 0; i < 4; i++) emma += sc.nextInt();
            if(gunnar>emma) System.out.println("Gunnar");
            else if(emma>gunnar) System.out.println("Emma");
            else System.out.println("Tie");
        }
    }
}