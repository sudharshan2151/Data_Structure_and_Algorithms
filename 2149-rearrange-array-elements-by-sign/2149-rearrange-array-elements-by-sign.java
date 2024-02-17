class Solution {
    public int[] rearrangeArray(int[] ar) {
        Queue<Integer> neg = new LinkedList<>();
        Queue<Integer> pos = new LinkedList<>();
        for(int a : ar){
            int res = a>=0?1:0;
            switch(res){
                case 1:
                    pos.add(a);
                    break;
                case 0:
                    neg.add(a);
                    break;
            }
        }
        for(int i=0;i<ar.length;i++){
           ar[i]=i%2==0?pos.remove():neg.remove();
        }
        
        return ar;
    }
}