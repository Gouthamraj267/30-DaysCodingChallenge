class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum-=1;
            }
            else{
                sum+=1;
            }
            if(sum==0){
                maxlen=i+1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}