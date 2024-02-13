import java.util.*;
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            char[] ar = strs[i].toCharArray();
           // Arrays.sort(ar);
           check(ar);
            if(map.containsKey(String.valueOf(ar))){
                List<String> r = map.get(String.valueOf(ar));
                r.add(strs[i]);
                map.put(String.valueOf(ar),r);
            }else{
                List<String> r = new ArrayList<>();
                r.add(strs[i]);
                map.put(String.valueOf(ar),r);
            }
        }
        for(String a : map.keySet()){
            res.add(map.get(a));
        }
        
        return res;
    }
    void check(char[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    char temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
}