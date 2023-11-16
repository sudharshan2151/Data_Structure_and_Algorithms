
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            int n = br.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=br.nextInt();
            }
            check(n,ar);
            tc--;
        }
    }
    
    static void check(int n , int[] ar){
        int i=0,j=n-1;
        int rightMax=0;
        int leftMax = 0;
        int result = 0;
        while(i<=j){
            if(ar[i]<=ar[j]){
                if(ar[i]>=leftMax)leftMax=ar[i];
                else result+=leftMax-ar[i];
                
                i++;
            }else{
                if(ar[j]>=rightMax)rightMax=ar[j];
                else result+=rightMax-ar[j];
                
                j--;
            }
        }
        System.out.println(result);
    }
}
