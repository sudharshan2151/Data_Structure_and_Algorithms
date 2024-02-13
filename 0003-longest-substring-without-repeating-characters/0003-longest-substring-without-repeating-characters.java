class Solution {
    public int lengthOfLongestSubstring(String s) {
       
       int max = 0;
       int i=0,j=0;
       Map<Character,Integer> map = new HashMap<>();
       while(i<s.length()&&j<s.length()){
           if(map.containsKey(s.charAt(j))){
               map.remove(s.charAt(i));
               i++;
           }
            else{
                map.put(s.charAt(j),j);
                max=Math.max(j-i+1,max);
                j++;
            }
       }
       System.out.println(map+" "+j+" "+i);
       return max;
    }
}