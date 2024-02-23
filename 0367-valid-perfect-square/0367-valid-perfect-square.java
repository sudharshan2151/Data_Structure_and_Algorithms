class Solution {
    public boolean isPerfectSquare(int num) {
       
        for(int i=1;i<=num;i++){
          long ans = (long)i*i;
          if(ans==num){
              return true;
          }
            if(ans>num){
                return false;
            }
        }
        return false;
    }
}