
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.valueOf(br.readLine());                
            String name = br.readLine();
            check(name,n,new StringBuilder(),0);
            
    }
    static void check(String name, int n , StringBuilder k,int ind){
        if(ind==n){
            return;
        }
        StringBuilder ne = new StringBuilder(k);
        ne.append(name.charAt(ind));
        System.out.println(ne);
        check(name,n,ne,ind+1);
        check(name,n,k,ind+1);
       
    }
}
