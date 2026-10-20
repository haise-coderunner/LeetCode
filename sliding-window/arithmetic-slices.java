class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        if (nums.length < 3) {
            return 0;
        }

        int count = 0;
        int current = 0;

        for (int i = 2; i < nums.length; i++) {

            int diff1 = nums[i] - nums[i - 1];
            int diff2 = nums[i - 1] - nums[i - 2];

            if (diff1 == diff2) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }

        return count;
    }
}