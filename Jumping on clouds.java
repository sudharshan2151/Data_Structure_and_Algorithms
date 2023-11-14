
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner br = new Scanner(System.in);
       int tc = br.nextInt();
       while(tc>0){
           tc--;
           int n = br.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
               ar[i]=br.nextInt();
           }
           check(n,ar);
       }
    }
    static void check(int n ,int[] ar){
        int count =0,i=0;
        while(i<n-1){
            if(ar[i]==1){
                i--;
            }else{
                i+=2;
                count++;
            }

        }
        System.out.println(count);
    }
}
