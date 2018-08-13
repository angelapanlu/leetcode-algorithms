//Given an array of integers that is already sorted in ascending order, 
//find two numbers such that they add up to a specific target number.
class TwoSumArrayII {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = null;
        int n = numbers.length;
        int i = 0, j = n-1;
        while(i < j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                res = new int[2];
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
        }
        return res;
    }
}
