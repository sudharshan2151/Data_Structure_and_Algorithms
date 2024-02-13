class Solution {
    public String reverseWords(String s) {
        String[] ar = s.trim().split("\\s+");
        String res = "";
        for(int i=0;i<ar.length;i++){
            res=ar[i]+" "+res;
        }
        return res.trim();
    }
}