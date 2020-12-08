public class singleNumberTest {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,3};

        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {

                int res = 0;
                for ( int i = 0; i < nums.length; i++)
                {
                    int k = 0;
                    for ( int j = 0; j < nums.length; j++)
                    {
                        if (nums[i] == nums[j]) k++;
                    }
                    if ( k == 1) { res = nums[i]; break;}
                }
                return res;
    }
}
