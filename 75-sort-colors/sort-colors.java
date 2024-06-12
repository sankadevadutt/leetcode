class Solution {
    public void sortColors(int[] nums) {
        // in-built method
        // Arrays.sort(nums);

        int low = 0, high = nums.length - 1;

        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

    }
}