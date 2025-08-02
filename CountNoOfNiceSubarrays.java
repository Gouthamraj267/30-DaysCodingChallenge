class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int countlessequalk=fun(nums,k);
        int countlessk=fun(nums,k-1);
        return countlessequalk-countlessk;
    }
    public static int fun(int[] nums,int k){
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]%2==1){
                count++;
            }
            while(count>k){
                if(nums[i]%2==1){
                    count--;
                }
                i++;
            }
            ans=ans+(j-i+1);
            j++;
        }
        return ans;
    }
}