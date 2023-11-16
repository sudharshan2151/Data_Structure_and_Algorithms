
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
         
        while(true){
            int n = br.nextInt();
            if(n==0){
                break;
            }
            int[] ar1 = new int[n];
                for(int i=0;i<n;i++){
                    ar1[i]=br.nextInt();
                }
            
            check(n,ar1);
        }
    }
    
    static void check(int n,int[] ar){
        int[] ar1 = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<n;i++){
            ar1[i]=ar[i];
        }
        Arrays.sort(ar1);
        stack.push(ar[0]);
        int i=0,j=1;
        while(i<n){
            while(j<n){
                if(stack.isEmpty()){
                    stack.push(ar[j]);
                    j++;
                }
                else if(stack.peek()!=ar1[i]){
                    stack.push(ar[j]);
                    j++;
                }else{
                    break;
                }
            }
            int k = stack.pop();
            if(k!=ar1[i]){
                System.out.println("no");
                return;
            }
            i++;
        }
        System.out.println("yes");
    }
}