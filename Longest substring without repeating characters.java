class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int max = 0;
        for(int i=0;i<s.length();i++){
             String k = "";
             for(int j=i;j<s.length();j++){
                 if(k.contains(s.charAt(j)+"")){
                    break;
                }else{
                    k+=s.charAt(j);
                }
                max =Math.max(k.length(),max);
             }
            
            

        }
        return max;
    }
}