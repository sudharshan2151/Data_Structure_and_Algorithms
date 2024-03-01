class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0,j = nums.length-1;
    //    if(nums.length==1){
    //        return nums[0];
    //    }
      
       while(i<j){
            if(nums[i]!=nums[i+1])
                return nums[i];
            i+=2;
       
       }
        return nums[j];
        
    }
}