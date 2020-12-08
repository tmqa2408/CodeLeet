import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDisappearedNumbersTest {
    public static void main(String[] args) {
        int[] array = {5,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(array));
        System.out.println(findDisappearedNumbers(array));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arrDisapNum = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < 9; i++){
            System.out.print( i + ", ");
        }
        int idxDisapNum = 0;
        for ( int i = 1; i <= nums.length; i++){
            int kN = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) { kN++; }
            }
            if ( kN == 0 ) {
                arrDisapNum.add(i);
                idxDisapNum++; }
        }
        return arrDisapNum;

/*
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
*/
    }

}
