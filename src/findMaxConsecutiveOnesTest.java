
public class findMaxConsecutiveOnesTest {

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int k = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] == 0)) { k++;}
            else { if (k > max) { max = k;
                k = 0;}
            else  k = 0;
            }
        }
        if (k > max) max = k;

        return max;
    }

}
