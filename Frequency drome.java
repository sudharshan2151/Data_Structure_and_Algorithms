
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            String name = br.next();
            check(name);
            tc--;
        }
        
    }
    
    static void check(String name){
        
        int n = name.length();
         char[] s1 = name.substring(0,n/2).toCharArray();
        char[] s2 = name.substring((int)Math.ceil((double)n/2),n).toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        if(String.valueOf(s1).equals(String.valueOf(s2)))System.out.println("Yes");
        else System.out.println("No");
        
    }
}
