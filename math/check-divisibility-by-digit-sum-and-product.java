class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;
        while (n > 0){
           int  r = n % 10;
            n = n / 10;
            sum=sum + r;
            product= product * r;
        }
        return num % (sum + product) == 0;
    }
}