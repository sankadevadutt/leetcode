class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int maxArea = 0;
        int i = 0, j = len-1;
        while(i<len && j>=0){
            maxArea = Math.max(maxArea, ((j-i)*Math.min(height[i],height[j])));
            if(height[i]<height[j]) i++;
            else j--;
        }
        
        return maxArea;
    }
}