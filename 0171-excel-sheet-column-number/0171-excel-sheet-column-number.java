class Solution {
    public int titleToNumber(String ar) {
        
        ar=ar.toLowerCase();
        int result = 0;
        int j=0;
        for(int i=ar.length()-1;i>=0;i--){
            result+=Math.pow(26,j++)*((ar.charAt(i)-'a')+1);
        }
        return result;
    }
}