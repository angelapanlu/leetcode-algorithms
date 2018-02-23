//There are two sorted arrays nums1 and nums2 of size m and n respectively.Find the median of the two sorted arrays. 
//Time complexity O(m+n)

class MedidanOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] array = new int[m+n];
        int i = 0, j = 0 , k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                array[k++] = nums1[i++];
            } else {
                array[k++] = nums2[j++];
            }
        }
        while (i < m) {
            array[k++] = nums1[i++];
        }
        while (j < n) {
            array[k++] = nums2[j++];
        }
        double median = getMed(array);
        return median;
    }
    
    private double getMed(int[] nums) {
        int len = nums.length;
        if (len % 2 == 1) {
            return nums[len/2];
        } else {
            return (double)(nums[len/2] + nums[len/2-1])/2;
        }
    }
}
