class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> lt = new ArrayList<>();
        
        int len = nums.length;
        
        for(int i = 0 ; i < len-3 ; i++ ){
            
            for(int j = i+1 ; j < len-2 ; j++ ){
                
                int left = j+1, right = len-1;
                
                while( left < right ){
                    
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if(sum == target){
                        
                        List<Integer> temp = Arrays.asList(nums[i],
                                                           nums[j],
                                                           nums[left],nums[right]);
                        
                        if(!lt.contains(temp)) lt.add(temp);
                        
                        left++;
                    
                    }
                    
                    else if(sum < target) left++;
                    
                    else right--;
                    
                    
                }
                
            }
            
        }
        
        return lt;
        
        
        
        
        
        
    }
}