class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int size1 = nums1.length, size2 = nums2.length;
        int comSize = size1+size2;
        int []combnd = new int[comSize];

        int in1 = 0, in2 = 0;
        int inc = 0;
        while( in1 < size1 && in2 < size2 )
            combnd[inc++] = nums1[in1]<nums2[in2]?nums1[in1++]:nums2[in2++];
        
        while( in1 < size1 ) combnd[inc++] = nums1[in1++];
        while( in2 < size2 ) combnd[inc++] = nums2[in2++];

        int mod = comSize%2;
        int mid = comSize/2;
        if(mod == 1)
            return (double)(combnd[mid]);
        else{
            return ((combnd[mid]+combnd[mid-1])/2.0);
        }


    }
}