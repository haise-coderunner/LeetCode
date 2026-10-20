class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length+1];
        for (int i =0;i< nums.length;i++){
            prefix[i+1]= prefix[i] + nums[i];
        }
        for (int i = 0;i< nums.length ;i++){
            if (prefix[i] == prefix[nums.length] - (nums[i] + prefix[i]) ){
                return i;
            }
        }
        return -1;
    }
}