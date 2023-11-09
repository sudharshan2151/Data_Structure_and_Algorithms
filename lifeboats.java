
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        for(int j=0;j<tc;j++){
            int n = br.nextInt();
            int k = br.nextInt();
            int[] ar =  new int[n];
            for(int i=0;i<n;i++){
               
                ar[i]=br.nextInt();
            }
            check(ar,k);
        }
    }
    static void check(int[] ar,int k){
        Arrays.sort(ar);
        int i=0,j=ar.length-1;
        int count=0;
        while(i<j){
            int k1=(ar[i]+ar[j]);
            if(k1<=k){
                i++;
                j--;
                count++;
            }else{
                j--;
                count++;
            }
            if(i==j){
                count++;
            }
        }
        System.out.println(count);
    }
}

