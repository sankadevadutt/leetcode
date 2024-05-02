class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        List<Integer> lt = new ArrayList<>();
        for(int i : nums){
            if(lt.contains(i)){
                ans = Math.max(Math.abs(i), ans);
            }
            lt.add(-i);
        }
        return ans;
    }
}