class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        s=s.trim();
        int i=s.length()-1;
        while(i>=0){
           int j=i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            str.append(s.substring(j+1,i+1));
            str.append(' ');
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            i=j;
        }
        return str.toString().trim();
    }
}