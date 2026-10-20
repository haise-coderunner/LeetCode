class Solution {
    private boolean gay(int[] piles, int h , int k){
        int totals =0;
        for (int pile : piles){
         totals+= (pile + k -1) / k;   
        }
        return totals <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
       Arrays.sort(piles);
       int low =1;
       int high =Arrays.stream(piles).max().orElse(1);
        while (low < high){
            int mid = (low + high)/2;
            if (gay(piles,h,mid)){
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
}