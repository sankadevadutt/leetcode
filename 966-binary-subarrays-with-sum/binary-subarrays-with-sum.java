class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int left = 0, right = nums.length;
        while(left < right){
            int cur = left;
            int cur_sum = 0;
            while(cur<right && (nums[cur]+cur_sum)<=goal){
                cur_sum+=nums[cur];
                if(cur_sum == goal) count++;
                cur++;
            }
            left++;
        }
        return count;
    }
}