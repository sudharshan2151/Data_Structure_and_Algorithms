class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        //Arrays.sort(nums);
        check(nums,0,list,new ArrayList<>());
        //System.out.println(list);
        return list;
        
    }
    void check(int[] nums, int ind, List<List<Integer>> list,List<Integer> l){
        System.out.println(list);

        list.add(new ArrayList<>(l));
        
        for(int i=ind;i<nums.length;i++){
            l.add(nums[i]);
            check(nums, i+1,list,l);
            l.remove(l.size()-1);
        }
    }
}