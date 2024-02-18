class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        char[] ar = s.toCharArray();
        char[] temp = s.toCharArray();
        int k = 1;
        for(int i=0;i<s.length();i++){
            reverse(0,s.length()-1,temp);
            reverse(0,s.length()-k-1,temp);
            reverse(s.length()-k,s.length()-1,temp);
            
            if(String.valueOf(temp).equals(goal)){
               // System.out.println(String.valueOf(temp));
                return true;
            }
            k++;
            temp = s.toCharArray();
        }
        return false;
    }
    
    void reverse(int i ,int j,char[] ar){
        
        while(i<j){
            char a = ar[i];
            ar[i]=ar[j];
            ar[j]=a;
            i++;
            j--;
        }
    }
}