class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        int count=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(stack.isEmpty()){
                    count++;
                }
                else{
                    stack.pop();
                }
            }
            i++;
        }
        count+=stack.size();
        return count;
    }
}