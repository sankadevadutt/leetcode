class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        
        int i = 0,k = 0, j = 0;
        
        if(len == 1) return 1;
        
        while(i<len && j<len){
            
            while(j<len && (nums[i] == nums[j])) j++;
            nums[k++] = nums[j-1];
            i=j;
            
        }
        return k;
    }
}