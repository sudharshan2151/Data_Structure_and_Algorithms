class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ar = ransomNote.toCharArray();
        char[] ar1 = magazine.toCharArray();
      
        Map<Character,Integer> map = new HashMap<>();
        for(char a : ar){
            map.compute(a,(key,value)->value==null?1:++value);
        }
        for(char a : ar1){
            if(map.containsKey(a)){
                int v = map.get(a);
                v--;
                map.put(a,v);
                if(map.get(a)==0){
                    map.remove(a);
                }
            }
        }
        return map.isEmpty();
    }
}