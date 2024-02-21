class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    
    void mergeSort(int[] ar ,int i,int j){
        if(i>=j)return;
        int mid = (i+j)/2;
        mergeSort(ar,i,mid);
        mergeSort(ar,mid+1,j);
        merge(ar,i,mid,j);
    }
    
    void merge(int[] ar, int left ,int mid, int high){
        
        List<Integer> list = new ArrayList<>();
        int i=left;
        while(i<=mid){
            list.add(ar[i++]);
        }
        List<Integer> list1 = new ArrayList<>();
        while(i<=high){
            list1.add(ar[i++]);
        }
        int[] arr = new int[list.size()+list1.size()];
        int j=0,k=0;
        i=0;
        while(i<list.size()&&j<list1.size()){
            if(list.get(i)<=list1.get(j)){
                arr[k++]=list.get(i++);
            }
            else{
                arr[k++]=list1.get(j++);
            }
        }
        while(i<list.size()){
            arr[k++]=list.get(i++);
        }
        
        while(j<list1.size()){
            arr[k++]=list1.get(j++);
        }
        
        for( i=0;i<arr.length;i++){
            ar[left++]=arr[i];
        }
    }
    
}