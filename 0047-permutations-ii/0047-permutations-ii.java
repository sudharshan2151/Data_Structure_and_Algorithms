class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ar = new ArrayList<>();
        check(nums,0,ar);
        return ar;
    }
    void check(int[] ar , int ind, List<List<Integer>> res){
        if(ind==ar.length){
            List<Integer> a = new ArrayList<>();
            for(int aa : ar)a.add(aa);
            if(!res.contains(a))
                res.add(a);
        }
        for(int i=ind;i<ar.length;i++){
            swap(ar,ind,i);
            check(ar,ind+1,res);
            swap(ar,ind,i);
        }
    }

    void swap(int[] ar ,int i, int j){
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}