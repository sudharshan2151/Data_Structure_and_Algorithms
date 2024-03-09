class Solution {
    public int[] searchRange(int[] ar, int target) {
        
        int i=0,j=ar.length-1;
        int[] ar1 = {-1,-1};
        int min = Integer.MAX_VALUE;
        while(i<=j){
            int mid = (i+j)/2;
            if(ar[mid]==target){
                min = Math.min(min,mid);
                j=mid-1;
            }
            else if(ar[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        ar1[0]=min==Integer.MAX_VALUE?-1:min;
        min = Integer.MIN_VALUE;
        i=0;
        j=ar.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(ar[mid]==target){
                min = Math.max(min,mid);
                i=mid+1;
            }
            else if(ar[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
         ar1[1]=min==Integer.MIN_VALUE?-1:min;
        return ar1;
    }
    
    
}