
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner br = new Scanner(System.in);
        int n = br.nextInt()-1;
        String str = br.next();
        String str1 = br.next();
        int strCount = 0;
        int str1Count = 0;
        while(n>=0){
            if(str.charAt(n)==str1.charAt(n)){
                strCount+=1;
                str1Count+=1;
            }
            else if((str.charAt(n)=='p'&&str1.charAt(n)=='s')||(str.charAt(n)=='s'&&str1.charAt(n)=='r') ||(str.charAt(n)=='r'&&str1.charAt(n)=='p')){
                str1Count+=1;
            }
            else {
                strCount+=1;
            }
            n--;
        }
       // System.out.println(strCount+" "+str1Count);
        System.out.println(strCount>str1Count?"First":strCount==str1Count?"Draw":"Second");
    }
}
