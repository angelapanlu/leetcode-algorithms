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
