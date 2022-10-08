public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        int a;
        int b;
        a = nums[0];
        b = nums[1];


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (target == nums[i] + nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;

    }
}
