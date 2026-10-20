class Solution {
    public int[] sortedSquares(int[] nums) {
    int[] results = new int[nums.length];
    int left = 0;
    int right = nums.length-1;
    for (int i = nums.length-1; i >= 0;i--){
        if (Math.abs(nums[left]) > Math.abs(nums[right])){
            results[i]= nums[left]* nums[left];
            left++;
        }
        else{
        results[i]= nums[right]* nums[right];
        right--;
        }
    }
    return results;
    }
}