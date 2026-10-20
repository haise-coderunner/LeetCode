class Solution {
    public int minimumDeletions(int[] nums) {
       int n = nums.length;
       if ( n <= 2){
        return n;
       } 
       int minidx =0;
       int maxidx = 0;
       for (int i =0; i< n;i++){
        if (nums[i] < nums[minidx]){
            minidx =  i;
        }
        if (nums[i] > nums[maxidx]){
            maxidx = i;
        }
       }
       int l = Math.min(maxidx,minidx);
       int r = Math.max(maxidx,minidx);
       int front = r+1;
       int back = n-l;
       int both = (l+1)+(n-r);
       return Math.min(front,Math.min(back,both));
    }
}