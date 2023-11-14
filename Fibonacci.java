
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.valueOf(name);
        long[] ar = new long[n+1];
        for(int i=0;i<n+1;i++){
            ar[i]=-1;
        }
        System.out.println(check(n,ar));
    }
    static long check(int n,long[] ar){
        
        if(n==0 ||n==1){
            return n;
        }
        
        
        if(ar[n]!=-1){
            return ar[n];
        }
        
        
        return ar[n]=check(n-1,ar)+check(n-2,ar);
    }
}
