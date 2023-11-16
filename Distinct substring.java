
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        for(int i=0;i<tc;i++){
            int n = br.nextInt();
            String str = br.next();
            check(n,str);
        }
        
    }
    
    static void check(int n , String str){
        Set<String> k = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n+1;j++){
                k.add(str.substring(i,j));
            }
        }
        System.out.println(k.size());
        
    }
}
