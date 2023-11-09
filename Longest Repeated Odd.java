
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
       int i=1,count=1,max =ar[0]%2==1?1:0;
       
       while(i<n){
           if(ar[i]!=ar[i-1]){
               count=1;
           }else{
               count++;
           }
           if(max<count&&ar[i]%2==1){
               max = count;
           }
           i++;
       }
       System.out.println(max);
    }
}
