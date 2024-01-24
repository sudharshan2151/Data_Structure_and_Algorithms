
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner br = new Scanner(System.in);
       int n = br.nextInt();
       int[][] ar = new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               ar[i][j]=br.nextInt();
           }
       }
       
       List<String> ar1 = new ArrayList<>();
       check(n,ar,ar1,0,0,""); 
       if(ar1.isEmpty())System.out.println(-1);
       else ar1.forEach(a->System.out.print(a+" "));
    }
    static void check(int n , int[][] ar,List<String> ar1 , int i,int j,String sum){
         if(i>=n||j>=n || i<0 || j<0 || ar[i][j]==0){
            return;
        }
        
         if(i==n-1&&j==n-1){
            ar1.add(sum);
        }
    
        ar[i][j]=0;
        check(n,ar,ar1,i+1,j,sum+"D");
        check(n,ar,ar1,i,j-1,sum+"L");
        check(n,ar,ar1,i,j+1,sum+"R");
        check(n,ar,ar1,i-1,j,sum+"U");
        ar[i][j]=1;
    }
}
