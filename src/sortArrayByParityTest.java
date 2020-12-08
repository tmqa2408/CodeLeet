import java.util.Arrays;

public class sortArrayByParityTest {
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
//        sortArrayByParity(A);
        System.out.println(Arrays.toString(sortArrayByParity(A)));

    }
    public static int[] sortArrayByParity(int[] A) {
        int[] A1 = new int [A.length];
        int idxTemp = 0;
           for (int i = 0; i < A.length; i++){
               if (A[i] % 2 == 0) { A1[idxTemp] = A[i] ;
               idxTemp++;}
           }
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 != 0) { A1[idxTemp] = A[i] ;
                idxTemp++;}
        }
        System.out.println(Arrays.toString(A1) + "***");
        return A1;
    }
}
