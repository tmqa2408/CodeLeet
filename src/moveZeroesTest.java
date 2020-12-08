import java.util.Arrays;

public class moveZeroesTest {
    public static void main(String[] args) {
        int [] nums = {0,0,1,0,1,0};
  //        [1,0,0,1]
 //             0,1,0,3,12
 //     Output: [1,3,12,0,0]
        moveZeroes(nums);
//        if (nums[0] == 0) moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] moveZeroes(int[] nums) {
        int qty0 = 0;
        for ( int i = 0; i < nums.length; i++){
            if (nums[i] == 0) qty0++;
        }

        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[index] = nums[j];
                index++;
            }
        }
        for ( int k = nums.length - qty0; k < nums.length; k++) {
            nums[index] = 0;
            index++;
        }

        return nums;
    }

}
