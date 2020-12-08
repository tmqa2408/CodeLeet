import java.util.Arrays;

public class sortedSquaresTest {
    public static void main(String[] args) {
        int[] A = {5, 0, -3};
        sortNonDecree(A);
        System.out.println(Arrays.toString(sortedSquares(A)));
    }


    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        sortNonDecree (A);
        return A;
    }

    public static int[] sortNonDecree(int[] A) {
        Arrays.sort(A);
        /*
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            int indexTemp = i;
            for (int j = i; j < A.length; j++) {
                if (A[j] < temp) { temp = A[j];
                    indexTemp = j;}
            }
            A[indexTemp] = A[i];
            A[i] = temp;
        }
        */
        return A;
    }
}
