class Solution {
    public int subarraySum(int[] nums, int k) {
    int[] prefix  = new int[nums.length+1];
    int sum =0;
    int count =0;
    for (int i = 0;i< nums.length;i++){
        prefix[i+1]= prefix[i]+nums[i];
        }
        for (int start = 0; start < nums.length;start++){
            for (int end = start ;end < nums.length; end++){
                sum =prefix[end+1] - prefix[start];
                if (sum == k){
                    count++;
                }
            }
        }
    
    return count;
    }
}