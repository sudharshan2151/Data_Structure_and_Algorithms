import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        int n = Integer.valueOf(name);
        String[] ar = br.readLine().trim().split(" ");
        int[] ar1 = new int[n];
        for(int i=0;i<n;i++){
            ar1[i]=Integer.valueOf(ar[i]);
        }
        Arrays.sort(ar1);
        check(n,0,"",ar1);
       // System.out.println(Arrays.toString(ar)+" "+n);
    }
    static Map<String,Integer> map = new HashMap<>();
    static void check(int n , int ind , String sum,int[] ar){
       if(!map.containsKey(sum)){
           map.put(sum,1);
            System.out.println(sum);
        }
        for(int i=ind;i<n;i++){
            check(n,i+1,sum+ar[i]+" ",ar);
        }
    }
}