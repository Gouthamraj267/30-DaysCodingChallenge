class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        fun(nums,used,list,current);
        return list;
    }
    public static void fun(int[] nums,boolean[] used,List<List<Integer>>list,List<Integer>current){
        if(current.size()==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])
            continue;
            current.add(nums[i]);
            used[i]=true;
            fun(nums,used,list,current);
            int val=current.get(current.size()-1);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}