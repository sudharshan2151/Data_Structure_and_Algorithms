import java.lang.*;
class Solution {
    public int findMin(int[] ar) {
        int i=0,j = ar.length-1;
        if(ar[i]<ar[j]){
            return ar[i];
        }
        int min = Integer.MAX_VALUE;
        while(i<=j){
            int mid = (i+j)/2;
                min = Math.min(ar[mid],min);
            if(ar[mid]>ar[j]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }
        return min;
        
    }
}