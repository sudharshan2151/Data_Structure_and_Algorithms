
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
       int a1=0,a2=0;
       for(int i=0;i<n;i++){
           if(i%2==0){
               a1+=ar[i];
           }
           else{
               a2+=ar[i];
           }
       }
       System.out.println(a1-a2==0?"YES":"NO");
    }
}
