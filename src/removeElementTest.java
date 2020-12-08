import java.util.Arrays;

public class removeElementTest {
    public static void main(String[] args) {
        int[] nums = {0,4,4,0,4,4,4,0,2};
        int val = 4;
 //       System.out.println(nums.length);
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
    public static int  removeElement(int[] nums, int val) {
//      qty of val is in the array
        int leng = 0;
        for ( int i = 0; i < nums.length; i++) {
            if (nums[i] == val) { leng++;}
        }
        leng = nums.length - leng;
        movElementsVal (nums, val, leng);

        return leng;
    }

    public static int[] movElementsVal (int[] nums, int val, int  leng) {
        for ( int i = 0; i < leng; i++ ) {
            if ( nums[i] == val) {int ti = i;
                int tnum = nums[i];
                for ( int j = leng; j < nums.length; j++) {
                    if (!(nums[j] == val)) { nums[i] = nums[j];
                        nums[j] = tnum;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
