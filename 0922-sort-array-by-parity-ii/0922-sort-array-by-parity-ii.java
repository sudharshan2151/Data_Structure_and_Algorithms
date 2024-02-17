class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Queue<Sort> odd = new LinkedList<>();
        Queue<Sort> even = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2!=nums[i]%2){
                if(i%2==0){
                    if(even.isEmpty()){
                        odd.add(new Sort(i,nums[i]));
                    }
                    else{
                        Sort ec = even.remove();
                        nums[ec.index]=nums[i];
                        nums[i]=ec.value;
                    }
                }
                else{
                   if(odd.isEmpty()){
                        even.add(new Sort(i,nums[i]));
                    }
                    else{
                        Sort ec = odd.remove();
                        nums[ec.index]=nums[i];
                        nums[i]=ec.value;
                    }
                  }
                }
            }
        
    
        System.out.println(Arrays.toString(nums));
    
        return nums;
    }
}
class Sort{
    
    int index;
    int value;
    
    Sort(int i,int v){
        this.index=i;
        this.value=v;
    }
}