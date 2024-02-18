class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    void reverse(int[] ar,int i ,int j){
        while(i<j){
           int temp = ar[i];
           ar[i] = ar[j];
           ar[j] = temp;
           i++;
           j--;
       }
    }
}