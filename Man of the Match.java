
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int tc = br.nextInt();
        while(tc>0){
            int n1 = br.nextInt()*6;
            int[] ar = new int[n1];
            for(int i=0;i<n1;i++){
                ar[i]=br.nextInt();
            }
            String k = check(n1,ar);
            
            System.out.println(k);
            tc--;
        }
    }
    
    static String check(int n1,int[]){
        int count = 0;
            int v = 0;
            int ab = 0;
            String last ="ab";
            int i=0;
            while(n1>0){
                count++;
                int n = ar[i++];
                if((count%6)==0 || n==3 || n==1){
                    
                    if((count%6==0)&&(n==1||n==3)){
                        if(last.equals("ab")){
                        ab+=n;
                    }else{
                        v+=n;
                        
                    }
                    }
                    else if(last.equals("ab")){
                        ab+=n;
                        last ="vir";
                    }
                    
                    else{
                        v+=n;
                        last ="ab";
                    }
                    
                }else{
                    if(last.equals("ab")){
                        ab+=n;
                        //last ="vir";
                    }else{
                        v+=n;
                        
                    }
                }
               
                n1--;
            }
            String k = ab>v?"AB de Villiers":ab==v?"Tie":"Virat Kohli";
            return k;
    }
}
