class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<fruits.length){
            map.put(fruits[j],j);
                if(map.size()>2){
                int index=Collections.min(map.values());
                map.remove(fruits[index]);
                i=index+1;
                }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}