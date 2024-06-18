class Solution {
    public boolean judgeSquareSum(int c) {
        int test = (int)Math.sqrt(c);
        for(int i = 0; i <= test; i++){
            int v1 = i*i;
            int target = c - v1;
            int v2 = (int)Math.sqrt(target);
            if(v2*v2 == target) return true;
        }
        return false;
    }
}