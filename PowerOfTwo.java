// Method 1

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return isPowerOfTwo(n/2) && (n%2==0);
    }
} 

// Method 2

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        else if((n & (n-1))==0)
        return true;
        else
        return false;
         
    }
}
