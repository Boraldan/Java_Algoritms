public class test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 3, 77, 9, 6, 1, 100, 5};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + search(77, array, 0, array.length-1));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int search (int value, int[] array, int min, int max){ //O(n*log n)
        int midPoint;
        if (max < min){
            return -1;
        }
        else{
            midPoint = (max - min) / 2 + min;
        }
        if  (array[midPoint] < value){
            return search(value, array, midPoint+1, max);
        }
        else{
            if (array[midPoint] > value){
                return search(value, array, min, midPoint-1);
            }
            else{
                return midPoint;
            }
        }
    }
}

