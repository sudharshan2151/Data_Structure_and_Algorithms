class Solution {
    public int maxProduct(int[] ar) {
        int prefix  = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix*=ar[i];
            suffix*=ar[ar.length-i-1];
            int max1 = Math.max(prefix,suffix);
            max = Math.max(max,max1);
        }
        return max;
    }
}