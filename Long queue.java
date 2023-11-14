
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=br.nextInt();
            
        }
       
        System.out.println(check(n,ar));
    }
    static int check(int n , int[] ar){
        int count =1 ;
        for(int i=0;i<n-1;i++){
            if(ar[i]>ar[i+1]){
                count++;
            }
        }
        return count;
    }
}
