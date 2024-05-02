class Solution {
    public int numberOfMatches(int n) {
        if( n < 3) return n-1;
        if(n%2 == 0) return n/2 + numberOfMatches(n/2);
        return n/2+numberOfMatches(n/2+1);
    }
}