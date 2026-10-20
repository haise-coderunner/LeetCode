class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] res = new int[2];
        for (int num : nums1){
            set.add(num);
        }
        for (int num : nums2){
            if (set.contains(num)){
                res[1]++;
                set2.add(num);
            }
        }
        for (int num : nums1){
            if (set2.contains(num)){
                res[0]++;
            }
        }
        return res;
    }
}