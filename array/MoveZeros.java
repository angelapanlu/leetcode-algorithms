class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        int len = nums.length;
        for ( ; j < len ; j ++ ) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            } 
        }
        for ( ; i < len ; i ++ ) {
            nums[i] = 0;
        }
    }
}
