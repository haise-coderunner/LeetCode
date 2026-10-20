class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
    String s = String.valueOf(Math.abs((long) x));
    char[] arr = s.toCharArray();
    int left = 0;
    int right = arr.length -1;
        while (left < right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        long result = Long.parseLong(new String(arr));
        if (negative) {
            result = -result;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }

    }
