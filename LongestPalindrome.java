class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        boolean hasodd=false;
        for(int val:map.values()){
             count+=(val/2)*2;
             if(val%2==1){
                hasodd=true;
             }
        }
        if(hasodd){
            count++;
        }
        return count;
    }
}