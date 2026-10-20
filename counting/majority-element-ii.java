class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : nums){
            map.put(i ,1 + map.getOrDefault(i ,0));
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > n/3){
               res.add(entry.getKey());
            }
        }
        return res;
    }
}