
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;
    
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int k = br.nextInt();
        int[] cost = new int[n];
        int[] page = new int[n];
        
        for(int i=0;i<n;i++){
            cost[i]=br.nextInt();
        }
        for(int i=0;i<n;i++){
            page[i]=br.nextInt();
        }
        check(n,k,cost,page,0,0,0);
        System.out.println(max);
    }
    
    static void check(int n ,int k ,int[] cost ,int[] page, int sum ,int sp,int ind){
        if(sum>k){
            return ;
        }
        max = Math.max(sp,max);
        for(int i=ind;i<n;i++){
            check(n,k,cost,page,sum+cost[i],sp+page[i],i+1);
        }
    }
}
