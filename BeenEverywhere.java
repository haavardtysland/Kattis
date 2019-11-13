import java.util.*;
import java.util.ArrayList;

public class BeenEverywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int count = 0;

        for(int i = 0; i < test; i++) {
            int trips = sc.nextInt();
            count = trips;
            ArrayList<String> trip = new ArrayList<String>();
            String thistrip="";
            for(int j = 0; j < trips+1; j++) {
                thistrip=sc.nextLine();
                if(trip.contains(thistrip)){
                    count--;
                }
                trip.add(thistrip);
            }
        System.out.println(count);
        }
     }
} 