class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] ar = new int[n+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int a[] : trust){
          if(a[0]!=a[1]){
             
              ar[a[0]]=-5;
              ar[a[1]]++;
    
          }
            
            
        }
        for(int i=1;i<=n;i++){
            int a = ar[i];
            if(a==(n-1)){
                return i ;
            }
        }
        return -1;
    }
}