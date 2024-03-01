class Solution {
    public int kthSmallest(int[][] ar, int k) {
       List<Integer> ar1 = new ArrayList<>();
        
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                ar1.add(ar[i][j]);
            }
        }
        Collections.sort(ar1);
        return ar1.get(k-1);
    }
}