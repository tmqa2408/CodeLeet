public class findNumbersTest {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int qtyEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int qtyDigit = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                qtyDigit++;
            }
            if( qtyDigit % 2 == 0) qtyEven++;
        }
        return qtyEven;
    }

}
