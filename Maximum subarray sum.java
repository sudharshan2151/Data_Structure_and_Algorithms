
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc =  br.nextInt();
        for(int i=0;i<tc;i++){
            int n = br.nextInt();
            int[] list = new int[n];
            
            for(int j=0;j<n;j++){
                list[j]=br.nextInt();
            }
            check(n , list);
        }
    }
    
    static void check(int n ,int[] nums){
       int maxCurrent = nums[0];
          int maxGlobal = nums[0];
          for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxGlobal,maxCurrent);
          }
          System.out.println(maxGlobal);
    }
    
}