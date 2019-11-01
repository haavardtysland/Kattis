import java.util.*;

class BookingARoom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRooms = sc.nextInt();
        int alreadyBooked = sc.nextInt();
        int[] bookedRooms = new int[alreadyBooked];
        boolean feil = true;

        for (int i = 0; i < alreadyBooked; i++) {
            bookedRooms[i] = sc.nextInt();
        }

        if (numRooms <= alreadyBooked) {
            System.out.println("too late");
            feil=false;
        }

        Random random = new Random();
        while (feil) {
            int randomNum = random.nextInt(numRooms) + 1;
            boolean print = true;
            for (int i = 0; i < bookedRooms.length; i++) {
                if (randomNum==bookedRooms[i]){
                    print=false;
                }
            }
            if (print==true){
                System.out.println(randomNum);
                feil=false;
            }
        }
        
    }
}