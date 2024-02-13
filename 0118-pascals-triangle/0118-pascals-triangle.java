class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> l = new ArrayList<>();
            if(list.isEmpty()){
                l.add(1);
                list.add(l);
            }
            else{
                int j = 0;
                int k = 1;
                List<Integer> hello = list.get(list.size()-1);
                l.add(1);
                while(j<hello.size()&&k<hello.size()){
                    l.add(hello.get(j++)+hello.get(k++));
                }
                l.add(1);
                list.add(l);
            }
        }
        System.out.println(list);
        return list;
    }
}