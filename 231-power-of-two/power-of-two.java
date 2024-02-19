class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        String str = Integer.toBinaryString(n);
        int ind = str.indexOf('1');
        while(ind!=-1){
            ind = str.indexOf('1',ind+1);
            if(ind!=-1) return false;
        }
        
        return true;
    }
}