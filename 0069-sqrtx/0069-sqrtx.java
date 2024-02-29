class Solution {
    public int mySqrt(int x) {
        if(x==1)return 1;
        long x1=x;
        long i=0,j=x/2;
        
        while(i<=j){
            long mid=(i+j)/2;
            long mid1= mid*mid;
            if((mid1)==x1)return (int)mid;
            else if(mid1>x1)j=mid-1;
            else i=mid+1;
        }
        return (int)j;
    }
}