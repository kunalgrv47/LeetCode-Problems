class Solution {
    public int climbStairs(int n) {
       
        if (n <= 2){
            return n;
        } 
        
        //x and y is to maintain the ways to climb previous 2 stairs. 
        int x = 1; 
        int y = 2;

        //ways to climb n steps = ways to climb (n-1) steps + ways to climb (n-2) steps
        for(int i = 3; i <= n; i ++) {
            int temp = x; 
            x = y; 
            y = temp + y;
        }
        return y;
    }
}