class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>list=new ArrayList<>();
        List<String>current=new ArrayList<>();
        fun(0,s,list,current);
        return list;
    }
    public static boolean isValid(String s, int i,int index){
        while(index<=i){
            if(s.charAt(index)!=s.charAt(i))
            return false;
            index++;
            i--;
        }
        return true;
    }
    public static void fun(int index,String s,List<List<String>>list,List<String>current){
        if(index==s.length()){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isValid(s,i,index)){
                String str=s.substring(index,i+1);
                current.add(str);
                fun(i+1,s,list,current);
                current.remove(current.size()-1);
            }
        }
    }
}