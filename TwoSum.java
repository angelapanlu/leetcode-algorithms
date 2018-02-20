import java.util.HashMap;
import java.util.Map;

class TwoSum {
  public static void main(String[] args) {
      int len = args.length;
      int[] array = new int[len-1];
      for (int i = 0 ; i < len-1 ; i ++ ) {
          array[i] = Integer.parseInt(args[i]);
      }
      int[] res = twoSum(array, Integer.parseInt(args[len-1]));
      System.out.println(res[0] + " " + res[1]);
  }

      public static int[] twoSum(int[] nums, int target) {
          int[] res = new int[2];
          Map<Integer, Integer> map = new HashMap<>();
          for (int i = 0 ; i < nums.length ; i ++ ) {
              if (map.containsKey(target - nums[i])) {
                  res[0] = map.get(target - nums[i]);
                  res[1] = i;
                  return res;
              }
              map.put(nums[i], i);
          }
          return res;
      }
}
