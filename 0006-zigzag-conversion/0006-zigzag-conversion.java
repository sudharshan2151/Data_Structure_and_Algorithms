class Solution {
    public String convert(String s, int n) {
        if(n==1){
            return s;
        }
        int n1 = s.length();
        char[][] ar = new char[n][n1];
      
       for(int i=0;i<n;i++){
           for(int j=0;j<n1;j++){
               ar[i][j]=' ';
           }
       }
        int k = 0,i=0,j=0;
       while(k<s.length()){
           while(i<n&&k<s.length()){
            //System.out.println(s.charAt(k));
               ar[i++][j]=s.charAt(k);
               k++;
           }
           i=n-2;
           j++;
           while(i>=0&&k<s.length()){
               ar[i][j]=s.charAt(k++);
               i--;
               j++;
           }
           i=1;
           j--;
       }

       String res = "";
       
       for( i=0;i<n;i++){
           //System.out.println(Arrays.toString(ar[i]));
           for( j=0;j<n1;j++){
               if(ar[i][j]!=' ')res+=ar[i][j];
           }
       }
       return res;
    }
}