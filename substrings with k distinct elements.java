import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int k = br.nextInt();
        String str = br.next();
        int c1 = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            Map<Character,Integer> map = new HashMap<>();
            
            for(int j=i;j<n;j++){
                if(map.containsKey(str.charAt(j))){
                    break;
                }
                if(count==k){
                    break;
                }
                map.put(str.charAt(j),1);
                count++;
            }
            if(map.size()==k){
                c1++;
            }
        }
        System.out.println(c1);
    }
}