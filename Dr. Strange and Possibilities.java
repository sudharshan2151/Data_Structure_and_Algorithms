
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.valueOf(name);
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=i+1;
        }
        check(n,0,"",ar);
       // System.out.println(Arrays.toString(ar)+" "+n);
    }
    
    static void check(int n , int ind , String sum,int[] ar){
       
            System.out.println(sum);
        
        for(int i=ind;i<n;i++){
            check(n,i+1,sum+ar[i]+" ",ar);
        }
    }
}

