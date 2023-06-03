class Solution {
    public int reverse(int x) {
        long val = (long)Math.pow(2,31);
        long max = val-1, min = -val;
        long rev = 0;
        int neg = 1;
        if(x<0){
             neg*=-1;
             x*=-1;
        }
        
        while(x>0){
            int v = x%10;
            rev = rev*10+v; 
            x/=10;
        }
        rev*=neg;
        if(rev > max || rev < min) return 0;
        else return (int)rev;
    }
}