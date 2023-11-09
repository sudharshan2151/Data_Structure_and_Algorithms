
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc =br.nextInt();
        while(tc>0){
            tc--;
            int k = br.nextInt();
            int n = br.nextInt();
            if((n*(n+1)/2)<=k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
