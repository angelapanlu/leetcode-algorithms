//3Sum Closest

class ThreeSumCloest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0 ; i < len ; i ++ ) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1, k = len-1;
            while (j < k) {
                int cur = nums[i] + nums[j] + nums[k];
                if (cur > target) {
                    k--;
                } else if (cur < target) {
                    j++;
                } else {
                    return target;
                }
                if (Math.abs(cur - target) < Math.abs(res - target)) {
                    res = cur;
                }
                while (j < len && j > 0 && nums[j] == nums[j-1]) {
                    j++;
                }
                while (k >= 0 && k < len-1 && nums[k] == nums[k+1]) {
                    k--;
                }
            }
        }
        return res;
    }
}

