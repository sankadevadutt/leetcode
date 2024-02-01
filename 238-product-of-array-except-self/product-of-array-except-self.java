class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k = 0;
        int pro = 1;
        int zeroCount = 0;
        for(int i : nums){
            if(i == 0) zeroCount++;
            else pro*=i;
        }

        int ret[] = new int[nums.length];
        for(int i : nums){
            if(i == 0){
                if(zeroCount > 1) ret[k++] = 0;
                else ret[k++] = pro;
            }else{
                if(zeroCount > 0) ret[k++] = 0;
                else ret[k++] = (pro/i);
            }
        }
        return ret;
    }
}