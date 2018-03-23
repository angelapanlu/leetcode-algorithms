//Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }
        int i = 0, j = 1;
        for ( j = 1 ; j < len ; j ++ ) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
