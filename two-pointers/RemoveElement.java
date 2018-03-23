//Given an array and a value, remove all instances of that value in-place and return the new length.

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0, j = 0;
        for ( j = 0 ; j < len ; j ++ ) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
