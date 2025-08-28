class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(digits.length()==0){
            return list;
        }
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        fun(0,sb,digits,list,map);
        return list;
    }
    public static void fun(int index,StringBuilder sb,String digits,List<String>list,Map<Character,String>map){
        if(index==digits.length()){
            list.add(sb.toString());
            return;
        }
        String str=map.get(digits.charAt(index));
        for(char ch:str.toCharArray()){
            sb.append(ch);
            fun(index+1,sb,digits,list,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}