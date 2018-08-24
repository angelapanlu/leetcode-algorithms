//Solution 1
class LongestPalindromeCount {
    public int longestPalindrome(String s) {
        int NUM = 256;
        int[] arr = new int[NUM];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        int res = 0;
        for (int i = 0 ; i < NUM ; i ++ ) {
            if (arr[i] >= 2) {
                res += (arr[i]/2)*2;
            }
        }
        if (s.length() > res) {
            res++;
        }
        return res;
    }
}

//Solution 2
class Solution {
    public int longestPalindrome(String s) {
        int NUM = 256;
        boolean[] arr = new boolean[NUM];
        int res = 0;
        for (char c : s.toCharArray()) {
            if (!arr[c]) {
                arr[c] = true;
            } else {
                arr[c] = false;
                res += 2;
            }
        }
        if (s.length() > res) {
            res++;
        }
        return res;
    }
}
