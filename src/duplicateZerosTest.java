import java.util.Arrays;

public class duplicateZerosTest {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static void duplicateZeros(int[] arr) {
        int fromIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { fromIndex = i;
                shiftArr (arr, fromIndex);
                i++; }
        }
    }
    private static int[] shiftArr(int[] arr, int fromIndex) {
        for ( int j = arr.length-1; j > fromIndex; j--){
            arr[j] = arr[j-1];
        }
        return arr;
    }
}


