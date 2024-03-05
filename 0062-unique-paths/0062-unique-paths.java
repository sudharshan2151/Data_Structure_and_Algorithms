class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ar = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=0;
            }
        }
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return check(ar,0,0,m,n,dp);
    }
    
    int check(int[][] ar,int i, int j, int m , int n,int[][] dp){
        if(i>=m || j>=n || ar[i][j]==1){
            return 0;
        }
        
        if(i==m-1&&j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        ar[i][j]=1;
        int x =check(ar,i+1,j,m,n,dp);
        int y =check(ar,i,j+1,m,n,dp);
        ar[i][j]=0;
        dp[i][j]=x+y;
        return dp[i][j];
    }
}