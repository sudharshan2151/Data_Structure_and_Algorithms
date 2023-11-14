
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner br = new Scanner(System.in);
       int r = br.nextInt();
       int c = br.nextInt();
       int[][] ar = new int[r][c];
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               ar[i][j]=br.nextInt();
           }
       }
       int i=br.nextInt();
       int j = br.nextInt();
       int shop1 = br.nextInt();
       int shop2 = br.nextInt();
    //   for(int k = 0;k<r;k++){
    //       System.out.println(Arrays.toString(ar[k])+" "+r+" "+c);
    //   }
    //   System.out.println(i+" "+j+" "+shop1+" "+shop2+" ");
       check(ar,i,j,shop1,shop2,r,c,0);
       System.out.println(max-1);
    }
    static int max = 0;
    static void check(int[][] ar, int i, int j, int e, int e1, int r, int c, int sum) {
            if ( (i == e && j == e1-1)) {
                max = Math.max(max, sum);
            }
            
            if (i<0|| j>=c || i >= r || j < 0 || ar[i][j] == 0) {
                return; 
            }
            
            if ( (i == e && j == e1-1)) {
                max = Math.max(max, sum);
            }
            int tem  = ar[i][j];
            ar[i][j]=0;
            
            check(ar, i - 1, j, e, e1, r, c, sum + tem); 
            check(ar, i + 1, j, e, e1, r, c, sum + tem ); 
            check(ar, i, j - 1, e, e1, r, c, sum + tem ); 
            check(ar, i, j + 1, e, e1, r, c, sum + tem ); 
            ar[i][j]=tem;
    }   
}
