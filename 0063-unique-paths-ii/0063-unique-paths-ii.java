class Solution {
    public int uniquePathsWithObstacles(int[][] ar ) {
        int[][] dp = new int[ar.length+1][ar[0].length+1];
        for(int i=0;i<=ar.length;i++){
            for(int j=0;j<=ar[0].length;j++){
                    dp[i][j]=-1;
            }
        }
        return check(ar,0,0,ar.length,dp);
    }
    
    int check(int[][] ar , int i ,int j, int n,int[][] dp){
        if(i>=n || j>=ar[0].length || ar[i][j]==1){
            return 0;
        }
        if(i==n-1&&j==ar[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        ar[i][j]=1;
        dp[i][j]= check(ar,i+1,j,n,dp)+check(ar,i,j+1,n,dp);
        ar[i][j]=0;
        return dp[i][j];
    }
}