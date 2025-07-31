class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<=r){
            int ans=Math.min(height[l],height[r])*(r-l);
            max=Math.max(ans,max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}