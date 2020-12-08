public class rotateArrTest {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,4,5,6};

        rotateArr(nums, k);

        for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " , ");}
    }

    private static int[] rotateArr(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
        }
        return nums;
    }
}
