class Solution {
    public String firstPalindrome(String[] words) {
        for(String a : words){
            if(check(a.toCharArray())){
                return a;
            }
        }
        return "";
    }
    boolean check(char[] ar){
        int i=0,j=ar.length-1;
        while(i<j){
            if(ar[i]!=ar[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}