
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
       int n1 = br.nextInt();
       int[][] ar = new int[n][n1];
       for(int i=0;i<n;i++){
          for(int j=0;j<n1;j++){
              ar[i][j]=br.nextInt();
          }
       }
        System.out.println(check(ar,n , n1)?"YES":"NO");
      
      
       }
    }
    static boolean check(int[][] ar,int n ,int n1){
        for(int i=0;i<n-1;i++){
          for(int j=0;j<n1-1;j++){
              if(ar[i][j]!=ar[i+1][j+1]){
                  return false;
              }
          }
       }
       return true;
    }
}
