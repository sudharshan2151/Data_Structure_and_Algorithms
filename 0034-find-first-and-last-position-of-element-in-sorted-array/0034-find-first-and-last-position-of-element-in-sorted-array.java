class Solution {
    public int[] searchRange(int[] ar, int target) {
        int[] res = {lowerBound(target,ar),upperBound(target,ar)};
        return res;
    }
    
    int lowerBound(int target,int[]ar){
        int i=0,j=ar.length-1;
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
        return min==Integer.MAX_VALUE?-1:min;
    }
    
    int upperBound(int target,int[] ar){
        int i=0,j=ar.length-1;
        
        int min = Integer.MIN_VALUE;
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
        return min==Integer.MIN_VALUE?-1:min;
    }
}