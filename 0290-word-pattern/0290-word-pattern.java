class Solution {
    public boolean wordPattern(String pattern, String s) {
       
        String[] ar = s.trim().split(" ");
        if(pattern.length()!=ar.length)return false;
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> map1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char a = pattern.charAt(i);
            if(map.containsKey(a)){
               boolean res =  map.get(a).equals(ar[i]);
                if(!res){
                    return false;
                }
                if(map1.get(ar[i])!=a){
                    return false;
                }
            }
            else if(map1.containsKey(ar[i])){
                return false;
            }
            else{
                map.put(a,ar[i]);
                map1.put(ar[i],a);
            }
        }
        return true;
    }
}