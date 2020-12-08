import java.util.Arrays;

public class replaceElementsTest {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++){
            int maxEl = arr[i + 1];
            for ( int j = i+1; j < arr.length; j++){
                if ( arr[j] > maxEl) maxEl = arr[j];
            }
            arr[i] = maxEl;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
