
import java.util.*;

public class BatterUp {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            double bats = sc.nextInt();

            double total = 0, bases=0, totalbats=0; 
            for (int i = 0; i < bats; i++) {
                bases = sc.nextInt();
                if (bases == -1) {
                    
                } else {
                total += bases;
                totalbats+=1;
                }
            }
            double result = ((total)/(totalbats));
            System.out.println(result); 
    }
}