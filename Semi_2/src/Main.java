import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{2,5,1,8,11,10,6,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array){ // O(n^2)

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {// j = 8
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}