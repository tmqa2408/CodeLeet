import java.util.Arrays;

public class thirdMaxTest {
    public static void main(String[] args) {
        int [] nums = {2, 2, 3, 1, 5, 9, 10};
        System.out.println(Arrays.toString(nums) + " 1 ");
        System.out.println(thirdMax (nums));
    }
    public static int thirdMax(int[] nums) {
        int thirMax = 0;
        int indexMax = 0;
        Arrays.sort(nums);
        int temp;
        for (int i = 0; i < nums.length / 2; i++){
            temp = nums[nums.length-i-1];
            nums[nums.length-i-1] = nums[i];
            nums[i] = temp;
        }
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums) + " 3 ");
        if (nums.length < 3) {indexMax = 0;}
        else {
        for (int i = 1; i < 3; i++){
            if (nums[i-1] > nums[i]) indexMax++;}
        }

        if (indexMax < 2) {indexMax = 0;}
        thirMax = nums[indexMax];

        return thirMax;
    }

    public static int removeDuplicates(int[] nums) {
        int writePointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }

}
