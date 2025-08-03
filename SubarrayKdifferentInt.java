class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int setlessequalk=fun(nums,k);
        int setlessk=fun(nums,k-1);
        return setlessequalk-setlessk;
    }
    public static int fun(int[] nums,int k){
        if(k<0){
            return 0;
        }
        int i=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=0;
        int ans=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            if(map.size()<=k){
                ans=ans+(j-i+1);
            }
            j++;
        }
        return ans;
    }
}