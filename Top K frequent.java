import java.io.*;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        for(int i=0;i<tc;i++){
            int n = br.nextInt();
            int k = br.nextInt();
            int[] ar = new int[n];
            for(int j=0;j<n;j++){
                ar[j]=br.nextInt();
            }
            check(n,k,ar);
        }
    }
    
    static void check(int n ,int k ,int[] ar){
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i],map.get(ar[i])+1);
            }else{
                map.put(ar[i],1);
            }
        }
       
        int[] ar1 = new int[k];
        for(int i=0;i<k;i++){
            int max = 0;
            int key = 0;
            for(int a : map.keySet()){
                if(map.get(a)>max){
                    max=map.get(a);
                    key=a;
                }
                
            }
            map.put(key,0);
            ar1[i]=key;
        }
        
        Arrays.sort(ar1);
        for(int i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+" ");
            
        }
        System.out.println();
    }
}