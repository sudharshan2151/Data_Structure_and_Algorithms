import java.util.*;

class Stack<T> {

   ArrayList<T> list ;
   
   Stack(){
     list=new ArrayList<>();
   }
   
   void push(T data){
     list.add(data);
   }
   
   T pop(){
     if(list.isEmpty()){
       return null;
     }
     return list.remove(list.size()-1);
   }
   
   T peek(){
      if(list.isEmpty()){
       return null;
     }
     return list.get(list.size()-1);
   }
   
   public String toString(){
    StringJoiner string = new StringJoiner(",");
    for(T a : list)string.add(a+"");
    return "{"+string+"}";
   }
   
   
}

public class Implementation{
  
  
  
  public static void main(String[] args){
    
    //Integers
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);
    
    //String
    Stack<String> stack1 = new Stack<>();
    stack1.push("Hello");
    stack1.push("How");
    stack1.push("bye");
    System.out.println(stack1);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
}