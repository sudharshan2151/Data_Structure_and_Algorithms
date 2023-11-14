
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
         Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            int n = br.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=br.nextInt();
            }
            check(n,ar);
            tc--;
        }
    }
    static void check(int n ,int[] ar){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        map.put(20,0);
        for(int i=0;i<n;i++){
            int change = ar[i]-5;
            if(change==15){
                int f = map.get(5);
                int t = map.get(10);
                if(f!=0&&t!=0){
                    f--;
                    t--;
                    map.put(5,f);
                    map.put(10,t);
                }
                else if(t==0&&f>2){
                    f=f-3;
                    map.put(5,f);
                }else{
                    System.out.println("NO");
                    return;
                }
            }
            if(change==5){
                int f = map.get(5);
                if(f!=0){
                     f--;
                    map.put(5,f);
                }else{
                    System.out.println("NO");
                    return;
                }
            }
            map.put(ar[i],map.get(ar[i])+1);
        }
        
        System.out.println("YES");
                    //return;
        
    }
}
