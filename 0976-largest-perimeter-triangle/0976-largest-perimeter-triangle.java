class Solution {
    public int largestPerimeter(int[] arr) {
        List<Integer> ar = new ArrayList<>();
        for(int a : arr)ar.add(a);
        int n = arr.length;
        Collections.sort(ar);
        int max = 0;
        int i=0,j=n-2,k=n-1;
        while(i<j){
            int sum = ar.get(i)+ar.get(j);
            if(sum>ar.get(k)){
                max=Math.max(max,sum+ar.get(k));
              // i++;
            }
                i++;
                if(i==j&&max==0){
                    i=0;
                    j--;
                    k--;
                }
            
        }
        return max;
    }
}