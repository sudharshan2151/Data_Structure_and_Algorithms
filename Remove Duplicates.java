
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    
    static String[] change(Stack<String> a){
        String[] k = new String[a.size()];
        int i = a.size()-1;
        while(!a.isEmpty()){
            k[i]=a.pop();
            i--;
        }
        return k;
    }
    
    static String[] check(String[] a,boolean f){
        if(f){
            return a;
        }
        Stack<String> k = new Stack();
        k.push(a[0]);
        int i=1;
        int count=1;
        boolean flag = true;
        while(i<a.length){
            if(k.peek().equals(a[i])){
                count++;
            }
            else if(count>1){
                while(count!=0){
                    k.pop();
                    count--;
                    
                }
                count=1;
                flag = false;
                
            }
            k.push(a[i]);
            
            i++;
        }
        
        if(count>1){
                while(count!=0){
                    k.pop();
                    count--;
                }
                count=1;
            }
     
        return check(change(k),flag);
       
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner br = new Scanner(System.in);
       int n = br.nextInt();
       br.nextLine();
       for(int i=0;i<n;i++){
           String[] a = br.nextLine().trim().split("");
          String[] a1 =  check(a,false);
          if(a1.length==0){
              System.out.print("Empty String");
          }else{
              for(String b : a1){
                  System.out.print(b);
              }
          }
          System.out.println();
       }
       
    }
}
