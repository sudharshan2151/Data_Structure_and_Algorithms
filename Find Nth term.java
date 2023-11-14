
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                
        int n = Integer.valueOf(name);
        System.out.println(check(n));
    }
   static int check(int n ){
        if(n==0 || n==1){
            return 10;
        }
        if(n==2){
            return -19;
        }
        if(n%2==0&&n%3==0){
            return (n/6)+(check(n-1)+check(n-3));
        }
        else if(n%2==0){
            return (n/2)-(check(n-1)+check(n-2));
        }
        else if(n%3==0){
            return (n/3)+(check(n-1)+check(n-3));
        }else{
            return check(n-1);
        }
    }
}
