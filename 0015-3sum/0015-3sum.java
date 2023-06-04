class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st = new HashSet<>();
        List<List<Integer>> lt = new ArrayList<>();
        
        for(int i =0;i<nums.length-2;i++){
            int left = i+1,right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    st.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                }
                if(sum < 0) left++;
                else right --;
            }
        }
        for(List<Integer> lt2 : st) lt.add(lt2);
        return lt;
    }
}