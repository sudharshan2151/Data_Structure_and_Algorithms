
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    
    public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            tc--;
            int n = br.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=br.nextInt();
            }

            
            
            int[] dp = new int[n];
            for(int i=0;i<n;i++){
                dp[i]=-1;
            }
            System.out.println(check(ar, n-1 ,0,dp));

        }
        
    }
    static int check(int[] ar, int n,int i, int[] dp){
        if(i==n){
            return ar[n];
        }
        if(i>n){
            return 0;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]=Math.max(check(ar,n-2,i,dp)+ar[n],check(ar,n-1,i,dp));
    }
}
