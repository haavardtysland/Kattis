import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Bijele {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kings = sc.nextInt();
    int queens = sc.nextInt();
    int rooks = sc.nextInt();
    int bishops = sc.nextInt();
    int knights = sc.nextInt();
    int pawns = sc.nextInt();

    System.out.println((1 - kings) + " " + (1 - queens) + " " + (2 - rooks) + " " + (2 - bishops) + " " + (2 - knights) + " " + (8 - pawns));

    }
}
