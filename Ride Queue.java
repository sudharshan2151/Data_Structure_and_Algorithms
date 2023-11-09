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
        int i=0;
        
        int count = 1;
        
        while(i<n-1){
            if(!(ar[i]<ar[i+1])){
                 count++;
            }
           
            i++;
           
        }
        System.out.println(count);
    }
}

