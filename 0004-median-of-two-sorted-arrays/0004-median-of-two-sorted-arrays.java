class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length, n2=nums2.length;
        
        int combnd[] = new int[n1+n2];
        
        int i=0, j=0, k=0;
        
        while(i<n1 && j<n2)
            combnd[k++] = nums1[i]>nums2[j]?nums2[j++]:nums1[i++];
        
        while(i<n1)
            combnd[k++] = nums1[i++];
        
        while(j<n2)
            combnd[k++] = nums2[j++];
        
        double median = ((n1+n2)%2 == 0)?((combnd[(n1+n2-1)/2]+combnd[(n1+n2)/2])/2.0):(combnd[(n1+n2-1)/2]);
        
        return median;
    }
}