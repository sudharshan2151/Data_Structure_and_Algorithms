class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : nums){
            map.compute(a,(k,v)->v==null?1:++v);
        }
        for(int a : map.keySet()){
            if(map.get(a)>(nums.length/2)){
                return a;
            }
        }
        return 0;
    }
}