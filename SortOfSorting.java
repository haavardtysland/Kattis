import java.util.*;

class SortOfSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        while(n != 0) {
            ArrayList<String> names = new ArrayList<>();
            for(int i = 0; i < names.size(); ++i) {
                names.add(sc.next());
            }

            String temp;
            for(int i = 0; i < names.size(); i++) {
                String substring = names.get(i).substring(0,2);
                ArrayList<Integer> index = new ArrayList<>();
                for(int j = i + 1 ; j < n; j++) {
                    if(array.get(i).substring(0,2).compareTo(array.get(j).substring(0,2)) > 0 && array[i].substring(0,2).compareTo(array[j].substring(0,2)) != 0 ){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            for(String x : array) {
                result += x + "\n";
            }
            n = sc.nextInt();
            result += n!=0 ? "\n" : "";
        }
        System.out.println(result);
        sc.close();
    }
}