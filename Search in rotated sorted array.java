class Solution {
    public int search(int[] ar, int target) {
        int start = 0;
        int end = ar.length-1;
        while(start<=end){
            
            int mid = (start+end)/2;
            System.out.println(ar[start]+" "+ar[mid]);
            if(ar[mid]==target){
                return mid;
            }
            else if(ar[start]<=ar[mid]){
                if(ar[start]<=target&&ar[mid]>target){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(ar[mid]<target&&ar[end]>=target){
                    start = mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            

        

            }
           
        
        return -1;
    
    }

}