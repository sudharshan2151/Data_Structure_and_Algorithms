
class Solution {
    public int reverse(int x) {

       if(!(x<=((int)Math.pow(2,31)-1)&&x>=((int)Math.pow(-2,31)) )){
            return 0;
        }
        
        long sum = 0;
       while(x!=0){
           sum=sum*10+x%10;
          // System.out.println(sum+" "+x);
           x/=10;
       }
       System.out.println((Math.pow(2,31)));
        if(sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE){
            
return 0;

            
        }

        return (int)sum;
        
        
    }
}