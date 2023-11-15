
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int count = 0;
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int k = br.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=br.nextInt();
        }
        check(ar,"",k,0,n);
        System.out.println(count);
    }
    
    static void check(int[] ar ,String ans, int k , int sum, int n ){
         if(sum==k){
            //System.out.println(ans);
            count++;
            return;
        }
        
        if(sum>k){
            return;
        }
       
         for(int i=0;i<n;i++){
        
            check(ar, ans+ar[i]+" ",k,sum+ar[i],n);
         }
    }
}
