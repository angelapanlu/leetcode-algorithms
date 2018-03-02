// Predict the Winner

class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return getWinner(nums, 0, nums.length-1, 0, 0, true);
    }
    
    public boolean getWinner(int[] nums, int i, int j, int sum1, int sum2, boolean player1) {
        if (i == j) {
            if (sum1 >= sum2) {
                return true;
            } else {
                return false;
            }
        }
        if (player1) {
            return getWinner(nums, i+1, j, sum1+nums[i], sum2, !player1) 
                || getWinner(nums, i, j-1, sum1+nums[j], sum2, !player1);
        } else {
            return getWinner(nums, i+1, j, sum1, sum2+nums[i], !player1) 
                && getWinner(nums, i, j-1, sum1, sum2+nums[j], !player1);
        }
    }
}
