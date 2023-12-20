class Solution {
    public void sortColors(int[] ar) {
       int zero = 0;
       int one = 0;
       int two = 0;
       for(int i=0;i<ar.length;i++){
           switch(ar[i]){
               case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                default:
                    zero++;
                    break;
           }
       }
       for(int i=0;i<ar.length;i++){
           if(zero!=0){
               ar[i]=0;
               zero--;
           }
           else if(one!=0){
               ar[i]=1;
               one--;
           }
           else{
               ar[i]=2;
               two--;
           }
       }
    }
}