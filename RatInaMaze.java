class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        fun(0,0,maze,list,sb);
        Collections.sort(list);
        return list;
    }
    public static boolean isValid(int i,int j,int[][] maze){
        if(i>=0 && j>=0 && i<maze.length && j<maze.length && maze[i][j]==1){
            return true;
        }
        return false;
    }
    public static void fun(int i,int j,int[][] maze,ArrayList<String>list,StringBuilder sb){
         if(!isValid(i,j,maze)){
             return;
         }
        if(i==maze.length-1 && j==maze.length-1){
            list.add(sb.toString());
            return;
        }
         maze[i][j]=0;
        sb.append("D");
        fun(i+1,j,maze,list,sb);
        sb.deleteCharAt(sb.length()-1);
        
         sb.append("R");
        fun(i,j+1,maze,list,sb);
        sb.deleteCharAt(sb.length()-1);
        
         sb.append("U");
        fun(i-1,j,maze,list,sb);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("L");
        fun(i,j-1,maze,list,sb);
        sb.deleteCharAt(sb.length()-1);
        
        maze[i][j]=1;
    }
}