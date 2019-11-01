import java.util.*;

public class ColdputerScience {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] temps = new int[length];
        int count = 0;
        for(int i = 0; i < length; i++){
            if(sc.hasNextInt()){
            temps[i]=sc.nextInt();
            } else {
            sc.close();
            }
        }

        for(int i = 0; i < length; i++) {
            if(temps[i] < 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}