class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left =0;
       int sum = 0;
       int minmallength = Integer.MAX_VALUE;
       for (int right = 0;right< nums.length;right++){
        sum = sum + nums[right];
       while (sum >= target){
        minmallength= Math.min(minmallength,right-left+1);
        sum = sum - nums[left];
        left++;
       }
       }
       if (minmallength == Integer.MAX_VALUE){
        return 0;
       }
       return minmallength;
    }
}