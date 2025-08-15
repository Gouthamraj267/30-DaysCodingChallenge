class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,candidates,target,list,current);
        return list;
    }
    public static void fun(int index,int[] candidates, int target,List<List<Integer>>list,List<Integer>current){
        if(index==candidates.length){
        if(target==0){
            if(!list.contains(current)){
            list.add(new ArrayList<>(current));
            }
            return;
        }
        return;
        }
            current.add(candidates[index]);
            fun(index+1,candidates,target-candidates[index],list,current);
            current.remove(current.size()-1);
            fun(index+1,candidates,target,list,current);
    }
}