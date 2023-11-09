
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
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=br.nextInt();
            }
            check(n,ar);
            tc--;
        }
    }
    
    static void check(int n,int[] ar){
        //System.out.println(n+" "+Arrays.toString(ar));
        Stack<Integer> stack = new Stack<>();
        int[] ar1 = new int[n];
        int i=0;
        while(i<n){
            while(!stack.isEmpty()&&ar[stack.peek()]<=ar[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ar1[i]=i+1;
            }else{
                ar1[i]=i-stack.peek();
            }
            stack.push(i);
            i++;
        }
        StringJoiner ab = new StringJoiner(" ");
        for(int a : ar1){
             ab.add(a+"");
        }
        System.out.println(ab);
    }
}
