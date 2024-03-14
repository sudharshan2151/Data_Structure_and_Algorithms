class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int i=0,j=s.length()-1;
        char[] ar = s.toCharArray();
        while(i<j){
            if(vowels.contains(ar[i]+"")&&vowels.contains(ar[j]+"")){
                 char temp = ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
            else if(vowels.contains(ar[i]+"")){
                j--;
            }
            else if(vowels.contains(ar[j]+"")){
                i++;
            }
            else{
                i++;
                j--;
            }
                    
        }
         return String.valueOf(ar);
    }
}