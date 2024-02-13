class Solution {
    public int sumOfUnique(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int a : nums)map.compute(a,(k,v)->v==null?0:1);
        int sum = 0;
        for(int a : map.keySet())sum+=map.get(a)==1?0:a;
        return sum;
       
    }
}