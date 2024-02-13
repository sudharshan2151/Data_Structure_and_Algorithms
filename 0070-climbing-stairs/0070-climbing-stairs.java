class Solution {
    public int climbStairs(int n) {
       
        if(n<=3)return n;

        int ans = 3;
        int prev = 2;
        for(int i=4;i<=n;i++){
            int an = ans;
            ans = ans+prev;
            prev = an;
        }
        return ans;
    }

}