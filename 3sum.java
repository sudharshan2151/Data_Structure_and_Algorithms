
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    
   public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc =  br.nextInt();
        for(int i=0;i<tc;i++){
            int n = br.nextInt();
            int[] list = new int[n];
            
            for(int j=0;j<n;j++){
                list[j]=br.nextInt();
            }
            check(n , list);
        }
    }
    
    static void check(int n ,int[] list){
        Set<List<Integer>> map = new LinkedHashSet();
        Arrays.sort(list);
        for(int i=0;i<n-2;i++){
            int x = list[i];
            int j=i+1;
            int k= n-1;
            while(j<k){
                int sum = x+list[j]+list[k];
                if(sum==0){
                    List<Integer> a =Arrays.asList(x,list[j],list[k]);
                    Collections.sort(a);
                    StringJoiner sj = new StringJoiner(" ");
                    a.forEach(p->sj.add(""+p));
                    map.add(a);
                    j++;
                }
                else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        //Collections.sort(map,(a,b)->a.compareTo(b));
        System.out.print(map.size());
        map.forEach(p->{
            System.out.println();
            p.forEach(k->System.out.print(k+" "));
        });
        System.out.println();
    }
}
