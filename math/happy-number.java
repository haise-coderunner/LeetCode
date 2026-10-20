class Solution {
    public int ssod (int n){
        int sum = 0;
        while (n !=0){
        int num =n;
        int r = num %10;
        sum = sum +(r*r);
        n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
       do {
            slow = ssod(slow);
            fast = ssod(ssod(fast));
            if(fast ==1)
            return true;
       }while(slow != fast);
            return false;
        }
    }