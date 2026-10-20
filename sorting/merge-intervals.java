class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> results = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1;i< intervals.length ;i++){
            if (end >= intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
            }
            else {
                results.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        results.add(new int[]{start,end});
        return results.toArray(new int[results.size()][]);
    }
}