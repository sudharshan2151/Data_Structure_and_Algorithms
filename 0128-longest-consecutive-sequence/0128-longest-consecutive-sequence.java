class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count = 1;
        int max = count;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                count++;
            }
            else if(nums[i]==nums[i+1]){
                
            }
            else{
                count=1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}