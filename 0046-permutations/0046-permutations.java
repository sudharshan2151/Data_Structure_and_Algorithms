class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ar = new ArrayList<>();
        check(nums,0,new ArrayList<>(),ar,nums.length);
        return ar;
    }
    public void check(int[] nums,int i,List<Integer> ar, List<List<Integer>>list,int n){
        if(i==n){
           
            List<Integer> temp = new ArrayList<>();
            for(int a : nums){
                temp.add(a);
            }
            
            list.add(temp);
            return;
        }
        
        for(int ind=i;ind<n;ind++){
            swap(i,ind,nums);
            
            check(nums,i+1,ar,list,n);
            swap(i,ind,nums);
        }
    }
    
    void swap(int i ,int j,int[] ar){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}