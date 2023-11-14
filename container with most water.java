
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
                ar[i]=(br.nextInt());
            }
            int i=0,j=n-1;
            int max=0;
            while(i<j){
                int l = Math.min(ar[i],ar[j]);
                int area = l*(j-i);
                max = Math.max(max,area);
                if(ar[i]>ar[j]){
                    j--;
                }else{
                    i++;
                }
            }
            System.out.println(max);
            tc--;
        }
    }
}

