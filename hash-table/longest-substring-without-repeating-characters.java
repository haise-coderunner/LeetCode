class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] ass = new int [128];
       for (int i = 0; i < ass.length;i++){
       ass[i]=-1;
       }
       int left = 0;
       int max= 0;
       for (int right = 0; right < s.length();right++){
        char current = s.charAt(right);
        if (ass[current] >= left){
            left = ass[current]+1;
        }
        ass[current]= right;


        max=Math.max(max, right-left+1); 
       }
       return max;
    }
}