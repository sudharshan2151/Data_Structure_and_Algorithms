class Solution {
    public int divide(int dividend, int divisor) {
        long d = dividend;
        long ans = d/divisor;
        System.out.println(ans);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if(ans<=min){
            System.out.println(ans);
            return min;
        }
        if(ans>=max){
            return max;
        }
        return (int)ans;
    }
}