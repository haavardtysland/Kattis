public class BubbleSort{
    public static void main(String[] args){
        int[] array = new int[]{1,3,5,8,2,6,9,4};
        bubbleSort(array);
        for(int x : array) {
            System.out.println(x);
        }
    }


   static void bubbleSort(int[] array) {
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length -1; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}