
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner br = new Scanner(System.in);
       int tc = br.nextInt();
       List<int[]> list = new ArrayList<>();
       for(int i=0;i<tc;i++){
           int n1 = br.nextInt();
           int n2 = br.nextInt();
           int[] ar = {n1,n2};
           list.add(ar);
       }
       Collections.sort(list,(a, b) -> Integer.compare(a[0], b[0]));
       List<int[]> ar = new ArrayList<>();
       ar.add(list.get(0));
       for(int i=1;i<tc;i++){
           int[] a = ar.get(ar.size()-1);
           int[] b =list.get(i);
           if(a[1]>=b[0]){
               a[1]=Math.max(b[1],a[1]);
               ar.set(ar.size()-1,a);
           }else{
               ar.add(b);
       }
    }
    ar.forEach(p->{
        System.out.println(p[0]+" "+p[1]);
    });
}

}
