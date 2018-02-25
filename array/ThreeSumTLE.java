//3Sum - TLE

class ThreeSumTLE {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
    
        if (len < 3) {
            return res;
        }
        for (int i = 0 ; i < len-2 ; i ++ ) {
            int j = i+1, k = len-1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> sumZeroList = new ArrayList<Integer>();
                    sumZeroList.add(nums[i]);
                    sumZeroList.add(nums[j]);
                    sumZeroList.add(nums[k]);
                    if (!res.contains(sumZeroList)) {
                        res.add(sumZeroList);
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
