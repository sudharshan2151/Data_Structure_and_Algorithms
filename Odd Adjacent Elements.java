
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int r = br.nextInt();
        int[][] ar = new int[n][r];
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                ar[i][j]=br.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                int count = 0;
	//top
                i--;
                if(i<n&&0<=i){
                    if(ar[i][j]%2!=0)count++;
                }
                i++;
	//bottom
                i++;
                if(i<n){
                    if(ar[i][j]%2!=0)count++;
                }
                i--;
        //left
                j--;
                if(j<r&&0<=j){
                    if(ar[i][j]%2!=0)count++;
                }
                j++;
	//right
                j++;
                if(j<r){
                    if(ar[i][j]%2!=0)count++;
                }
                j--;
	//checking
                if(count>=2)ar[i][j]=-1*ar[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
