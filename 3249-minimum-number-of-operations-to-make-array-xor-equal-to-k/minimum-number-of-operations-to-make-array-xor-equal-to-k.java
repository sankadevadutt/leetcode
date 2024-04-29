class Solution {
    public int minOperations(int[] nums, int k) {
        int finalXor = 0;
        for(int i : nums){
            finalXor ^= i;
        }

        return Integer.bitCount(finalXor ^ k);
    }
}