public class Solution {
    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (2 * arr[j])) {
                    return true;
                }
                if (arr[j] % 2 == 0) {
                    if (arr[j] / 2 == arr[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
 //       [-2,0,10,-19,4,6,-8]
 //       [9,8,7,6,5,4,3,2,1,0]
 //       0,3,2,1
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        /*
        boolean output = Solution.checkIfExist(arr);
        System.out.println("output  " + output);
        */

        System.out.println(Solution.validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] A) {
//        Input: [0,3,2,1]
//        Output: true
//        int max = Arrays.stream(A).max().getAsInt();
        if (A.length < 3) return false;
        int maxVal = A[0];
        int indxMaxVal = 0;
        for ( int i = 1; i < A.length; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
                indxMaxVal = i;
            }
        }
        if (A.length - 1 == indxMaxVal) return false;
        if ( indxMaxVal == 0 ) return false;
        for ( int j = 1; j <= indxMaxVal; j++){
            if ( A[j - 1] > A[j]) { return false;}
        }
        for ( int k = indxMaxVal; k < A.length - 1; k++){
            if ( A[k] <= A[k + 1]) { return false;}
        }
        return true;
    }

}