class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;

        long rev = 0;
        int save = x;
        while(x>0){
            int a = x%10;
            rev = rev*10+a;
            x/=10; 
        }
        return (rev == save);


    }
}