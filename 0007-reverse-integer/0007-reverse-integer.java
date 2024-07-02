class Solution {
    public int reverse(int x) {
        int sum =0, r=0;
        int n=x;
        while(n!=0) {
            r=n%10;
            if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && r > 7)) return 0;
            if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && r < -8)) return 0;
            sum = r+ sum*10;
            n=n/10;
        }
        return sum;
    }
}