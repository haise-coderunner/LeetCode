class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
                int sum1=0;
                int sum2=0;
                for( int i =0;i< nums1.length;i++){
                sum1 += nums1[i];
                sum2 += nums2[i];
                }
                 int g1 = maxgain(nums1,nums2);
                 int g2 =maxgain(nums2,nums1);
         
    
                return Math.max(g1+sum1,g2+sum2);
    }
    public int maxgain(int[] a, int[] b){
        int currentsum =0;
        int maxsum =0;
        for (int i =0;i<a.length;i++){
            int difference = b[i]-a[i];
            currentsum = Math.max(0,currentsum+difference);
            maxsum= Math.max(currentsum,maxsum);
        }
        return maxsum;

    }


    }