
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
        int count = 1;
        int i = 1;
        while(i<name.length()){
            if(name.charAt(i)!=name.charAt(i-1)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
