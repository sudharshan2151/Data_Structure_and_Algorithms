
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static boolean flag = true;
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int k = br.nextInt();
        List<Integer> arr = new ArrayList<>();
        check(n,k,arr,1);
        if(flag) 
            System.out.println(-1);
        
    }
    
    static void check(int n ,int k , List<Integer> ar1,int ind){
        if(ar1.size()==k){
            int k1 = ar1.stream().mapToInt(a->a).sum();
            if(k1==n){
                ar1.forEach(a->System.out.print(a+" "));
                System.out.println();
                flag = false;
            }
            
            return;
        }
        for(int i=ind;i<=9;i++){
            ar1.add(i);
            check(n,k,ar1,i+1);
            ar1.remove(ar1.size()-1);
        }
    }
}
