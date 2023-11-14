
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        //System.out.println(n);
        Hello[] ar = new Hello[n];
        //System.out.println(n);
        int i=0;
        int n1 = n;
        while(n1>0){
            String k = br.next();

            //System.out.println(br.next()+" ");
            int k1 = br.nextInt();
            //System.out.println(k+" "+k1);
            Hello hello = new Hello(k,k1);
            //System.out.println(hello.k+" "+hello.name);
            ar[i]=hello;
            i++;
            n1--;
        }
        for( i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i].k<ar[j].k){
                    Hello temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
                 if(ar[i].k==ar[j].k){
                    int n11 = ar[i].name.compareTo(ar[j].name);
                    //System.out.println(ar[i].name+" "+n11+" "+ar[j].name);
                    if(n11>=1){
                        //System.out.println(n1)
                        Hello temp = ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
                }
            }
        }
        int j=1;
        int mark = ar[0].k;
        System.out.println(j+" "+ar[0].name);
        for(i=1;i<n;i++){
            if(mark!=ar[i].k){
                j=i+1;
                
            }
            System.out.println(j+" "+ar[i].name);
            
            mark =ar[i].k;
            
        }
    }
}

class Hello{
    String name;
    int k ;
    Hello(String n,int k1){
        this.name=n;
        this.k=k1;
    }
}
