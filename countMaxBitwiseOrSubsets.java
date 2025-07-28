class Solution {
    public int countMaxOrSubsets(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>current=new ArrayList<>();
        maxor(nums,0,ans,current);
        int maxi=Collections.max(ans);
        int count=0;
        for(int j=0;j<ans.size();j++){
            if(ans.get(j)==maxi){
                count++;
            }
        }
        return count;
    }
    public static void maxor(int[] nums,int i,ArrayList<Integer>ans,ArrayList<Integer>current){
        if(i==nums.length){
            int or=0;
            for(int k=0;k<current.size();k++){
                or=or|current.get(k);
            }
            ans.add(or);
            return;
        }
        maxor(nums,i+1,ans,current);
        current.add(nums[i]);
        maxor(nums,i+1,ans,current);
        current.remove(current.size()-1);
    }
}