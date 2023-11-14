
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
    static void check(int n ,int[] ar){
           if(n==1){
                System.out.println(0);
                return;
            }
            String k = ar[0]>ar[1]?"1 ":"0 ";
            for(int i=1;i<n-1;i++){
                if(ar[i]>ar[i-1]&&ar[i]>ar[i+1]){
                    k+="2"+" ";
                }
                else if(ar[i]>ar[i-1] || ar[i]>ar[i+1]){
                    k+="1"+" ";
                }else{
                    k+="0"+" ";
                }
            }
            k+=ar[n-1]>ar[n-2]?"1":"0";
            System.out.println(k);
    }
}

