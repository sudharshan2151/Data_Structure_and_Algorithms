class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] ar = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                ar[k++]=nums2[j++];
            }else{
                ar[k++]=nums1[i];
                i++;
            }
        }
        while(i<nums1.length){
            ar[k++]=nums1[i];
                i++;
        }
        while(j<nums2.length){
            ar[k++]=nums2[j++];
        }
        if(ar.length%2==0){
          return  (double)(ar[ar.length/2]+ar[(ar.length/2)-1])/2;
        }
        return (double)ar[ar.length/2];
    }
}