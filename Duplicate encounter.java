
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        Stack<Character> stack = new Stack();
        int i=0;
        while(i<name.length()){
            if(!stack.isEmpty()&&stack.peek()==name.charAt(i)){
                stack.pop();
            }else{
                stack.push(name.charAt(i));
            }
            i++;
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        StringBuilder k1 = new StringBuilder();
        while(!stack.isEmpty()){
            k1.append(stack.pop());
        }
        System.out.println(k1.reverse());
    }
}
