class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char a : s.toCharArray())map.compute(a,(k,v)->v==null?1:++v);
        String result = "";
        for(char a: map.keySet()){
            char key = a;
            int max = map.get(a);
            for(char b : map.keySet()){
                if(max<map.get(b)){
                    key=b;
                    max=map.get(b);
                }
                else if(max==map.get(b)&&b<a){
                    key=b;
                }
            }
            for(int i=0;i<max;i++)result+=key;
            map.put(key,0);
        }
        
        return result;
        
    }
}