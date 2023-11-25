class Solution {
    public void nextPermutation(int[] nums) {
        int hello = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                hello=i;
                break;
            }
        }
        if(hello==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[hello]){
                int temp = nums[hello];
                nums[hello]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        int i=hello+1,j=nums.length-1;
        while(i<j){
            int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
        }
        return;
        
    }
}