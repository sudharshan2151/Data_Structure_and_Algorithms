class Solution {
    public String[] sortPeople(String[] names, int[] height) {
        int n = names.length;
        for(int i=0;i<n-1;i++){
            boolean tc = true;
            for(int j=0;j<n-i-1;j++){
                if(height[j]<height[j+1]){
                    int temp = height[j];
                    height[j]=height[j+1];
                    height[j+1]=temp;
                    String next = names[j];
                    names[j]=names[j+1];
                    names[j+1]=next;
                    tc=false;
                }
            }
            if(tc)break;
        }
        return names;
    }
}
