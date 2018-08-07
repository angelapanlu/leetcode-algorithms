class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0 ; i < nums.length ; i ++ ) {
            res ^= nums[i]; //XOR bit operation
        }
        return res;
    }
}
