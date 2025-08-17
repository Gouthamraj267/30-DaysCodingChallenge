class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>list=new ArrayList<>();
        char[][] current=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                current[i][j]='.';
            }
        }
        fun(0,list,current);  
        return list;      
    }
    public static boolean isSafe(char[][] current,int row,int col){
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0){
            if(current[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(current[row][col]=='Q')
            return false;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(row<current.length && col>=0){
            if(current[row][col]=='Q')
            return false;
            row++;
            col--;
        }
        return true;
    }
    public static void fun(int col,List<List<String>>list,char[][] current){
        if(col==current.length){
            List<String>board=new ArrayList<>();
            for(int i=0;i<current.length;i++){
                board.add(new String(current[i]));
            }
            list.add(board);
            return;
        }
        for(int row=0;row<current.length;row++){
            if(isSafe(current,row,col)){
                current[row][col]='Q';
                fun(col+1,list,current);
                current[row][col]='.';
            }
        }
    }
}