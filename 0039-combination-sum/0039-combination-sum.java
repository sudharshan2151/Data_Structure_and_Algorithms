class Solution {
    public List<List<Integer>> combinationSum(int[] ar, int k) {
        
        List<List<Integer>> hello = new ArrayList<>();
        Arrays.sort(ar);
        sum(ar,k,0,new ArrayList<>(),0,hello);
        Set<List<Integer>>result = new LinkedHashSet<>();
        for(List<Integer> a : hello){
            Collections.sort(a);
            result.add(a);
        }
        hello=new ArrayList(result);
        return hello;
    }

     void sum(int[] ar , int k , int ind , List<Integer> ar1,int sum,List<List<Integer>> hello){
        if(sum==k){
             System.out.println(hello);
            
            List<Integer> rem = new ArrayList(ar1);
            
            hello.add(rem);
            return;
           
        }
         if(ind==ar.length || sum>k){
             return;
         }
        for(int i=ind;i<ar.length;i++){
            ar1.add(ar[i]);
            System.out.println(sum);
            sum(ar,k,i,ar1,sum+ar[i],hello);
            ar1.remove(ar1.size()-1);
        }
        
    }

    
}