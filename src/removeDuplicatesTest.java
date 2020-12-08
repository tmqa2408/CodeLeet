import java.util.Arrays;

public class removeDuplicatesTest {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Arrays.sort(nums);
        int qtyUnicElem = 1;
        for (int i = 1; i < nums.length; i++){
            if (!(nums[i] == nums[i - 1])) {
                nums[qtyUnicElem] = nums[i];
                qtyUnicElem++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(" numunicElem   " + qtyUnicElem);
    }
}
