
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  name = Integer.valueOf(br.readLine());                // Reading input from STDIN
        while(name>0){
            int k =Integer.valueOf(br.readLine()); 
             //System.out.println(k);
             List<Integer> list = new ArrayList<>();
             
            check(k,1,0,"",list);
            Collections.sort(list);
            System.out.println(list.get(0));
            
            name--;
        }
    }
   
    
    static void check(int k ,int ind,int sum,String s,List<Integer> list ){
        if(sum==k){
            
           list.add(Integer.valueOf(s));
        }
        if(ind>9){
            return ;
        }
        
        
        check(k,ind+1,sum+ind,s+ind,list);
        check(k,ind+1,sum,s,list);
    }
}
