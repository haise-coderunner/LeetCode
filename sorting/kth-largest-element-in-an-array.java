class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for(int num : nums){
            hp.add(num);
            if (hp.size() > k){
                hp.poll();
            }
        }
        return hp.peek();
    }
}