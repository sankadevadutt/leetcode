class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int cur = nums[i];
            if(mp.containsKey(target-cur)){
                int arr[] = {mp.get(target-cur),i};
                return arr;
            }
            mp.put(cur,i);
        }
    return new int[2];
    }
}