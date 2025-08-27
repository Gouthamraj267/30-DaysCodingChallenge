class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        fun(n,n,list,sb);
        return list;
    }
    public static void fun(int open,int close,List<String>list,StringBuilder sb){
        if(open==0 && close==0){
            list.add(sb.toString());
            return;
        }
        if(open>0){
        sb.append('(');
        fun(open-1,close,list,sb);
        sb.deleteCharAt(sb.length()-1);
        }
        if(close>open){
            sb.append(')');
            fun(open,close-1,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}