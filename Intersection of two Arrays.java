class Solution {
    public int[] intersect(int[] ar1, int[] ar2) {
        List<Integer> list = new ArrayList<>();
        //if()
        for(int i=0;i<ar1.length;i++){
            for(int j=0;j<ar2.length;j++){
                if(ar2[j]==ar1[i]){
                    ar2[j]=-1;
                    list.add(ar1[i]);
                    break;
                }

            }
        }
            int[] ar = new int[list.size()];
            for(int i=0;i<list.size();i++){
                ar[i]=list.get(i);
            }
            return ar;
        
        
    }
}