class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1,i=digits.length-1;
        List<Integer> ar = new ArrayList<>();
        while(i>=0){
            int k = carry+digits[i];
            carry=k/10;

            ar.add(k%10);
            i--;
        }
        if(carry>=1){
            ar.add(carry);
        }
        int[] arr = new int[ar.size()];
        int j =0;
        for(i=ar.size()-1;i>=0;i--){
            arr[j++]=ar.get(i);
        }
        return arr;
        
    }
}