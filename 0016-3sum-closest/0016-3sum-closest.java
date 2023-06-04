class Solution {
    
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int ans = Integer.MAX_VALUE;
        int len = nums.length;
        
        for( int i = 0 ; i < len - 2 ; i++ ){
            
            int left = i + 1 , right = len - 1 ;
            while( left < right ){
                
                int sum = nums[i] + nums[left] + nums[right] ;
                
                if(sum == target) ans = sum;
                else if(Math.abs(target-sum) < Math.abs(target-ans)) ans = sum;
                
                if( sum <= target ) left++;
                else right--;
                
                
            }
            
        }
        
        
        
        
        return ans;
        
    }
}