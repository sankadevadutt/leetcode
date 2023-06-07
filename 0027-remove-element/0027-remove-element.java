class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, len = nums.length , right = len-1;
        
        while(left < len && right >= 0){
            
            while(right >= 0 && nums[right] == val) right--;
            
            while(left < len && nums[left] != val) left++;
            
            while(left < len && right > left && nums[left] == val) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
            
            left++;
            
        }
        
        for(int i = 0;i<len;i++){
            if(nums[i] == val) return i;
        }
        
        return len;
        
    }
}