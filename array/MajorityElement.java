class MajorityElement {
    //sort the array and get the middle element isn't hard to figure out
    //this majority vote method is a good solution!
    public int majorityElement(int[] nums) { 
        int cnt = 0, res = 0;
        int len = nums.length;
        for (int i = 0 ; i < len ; i ++) {
            if (cnt == 0) {
                res = nums[i];
                cnt++;
            } else if (nums[i] == res) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return res;
    }
}
