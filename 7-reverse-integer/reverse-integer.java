class Solution {
    public int reverse(int x) {
        int isNeg = x<0?-1:1;
        x = Math.abs(x);
        long reverse = 0;
        while(x>0){
            int a = x%10;
            reverse = reverse*10+a;
            x/=10;
        }
        int max = (int)(Math.pow(2,31)-1);
        int min = -(int)(Math.pow(2,31));
        if(reverse>max || reverse<min) return 0;
        return (int)reverse*isNeg;
    }
}