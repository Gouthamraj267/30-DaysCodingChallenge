class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0;
        int j=0;
        int m=mat.length;
        int n=mat[0].length;
        int[] arr=new int[m*n];
        int index=0;
        while(index<m*n){
            while(i>=0 && j<n){
                arr[index]=mat[i][j];
                index++;
                i--;
                j++;
            }
            if(j>=n){
                j=n-1;
                i=i+2;
            }
            if(i<0){
                i=0;
            }
            if(index>=m*n){
                break;
            }
            while(j>=0 && i<m){
                arr[index]=mat[i][j];
                index++;
                i++;
                j--;
            }
            if(i>=m){
                i=m-1;
                j=j+2;
            }
            if(j<0){
                j=0;
            }
        }
        return arr;
    }
}