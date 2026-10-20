class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int majority = 0;
        for (int num : nums){
            map.put(num,1 + map.getOrDefault(num,0));
            if (map.get(num) > majority){
                res = num;
                majority = map.get(num);
            }
        }
        return res;
    }
}