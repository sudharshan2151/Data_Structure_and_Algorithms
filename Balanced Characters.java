
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            int n = br.nextInt();
            String[] ar = br.next().trim().split("");
            check(n,ar);
            tc--;
        }
    }
    
    static void check(int n ,String[] ar){
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Stack<String> stack = new Stack<>();
       int i=0;
       while(i<n){
           if(a.contains(ar[i])){
               if(!stack.isEmpty()&&stack.peek().equalsIgnoreCase(ar[i])){
                   stack.pop();
               }else{
                   System.out.println("False");
                   return;
               }
               
           }else{
               stack.push(ar[i]);
           }
           i++;
       }
       if(stack.isEmpty()) System.out.println("True");
       else System.out.println("False");
       
       
    }
}

