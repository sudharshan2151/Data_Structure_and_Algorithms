import java.lang.*;
import java.util.*;
class Main {
    static void happy(int n){
        
        HashSet<Integer> words = new HashSet<>();
        
        while((n>1)&&(!words.contains(n))){
            words.add(n);
            int s = 0;
            int k = n;
            while(k!=0){
                s+=Math.pow((k%10),2);
                k=k/10;
            }
            n = s;
            
        }
        if(n==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        for(int i=0;i<tc;i++){
            int n = br.nextInt();
            happy(n);
        }
    }
}
