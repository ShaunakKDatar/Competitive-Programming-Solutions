import java.util.Arrays;

public class LCMajorityNumber {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        int mid = (nums.length - 1) / 2;
        return nums[mid];

    }

}