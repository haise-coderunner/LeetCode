class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = assleft(nums,target);
        int high = assright(nums,target);
        if (low <= high && low < nums.length && high >=0 && nums[low] == target && nums[high] ==target){
            return new int[] {low,high};
        }
        return new int[] {-1,-1};
    }

        private int assleft (int[] nums,int target){
            int left =0; 
            int right = nums.length -1;
            while (left <= right){
                int mid = left +(right - left) /2;
                if (nums[mid] < target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
                
            }
            return left;
        }
       private int assright (int[] nums,int target){
            int left =0; 
            int right = nums.length -1;
            while (left <= right){
                int mid = left +(right - left) /2;
                if (nums[mid] <= target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
                
            }
            return right;
       } 
}