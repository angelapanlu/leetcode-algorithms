//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int len = s.length();
        int longest = 0;
        String res = "";
        for (int i = 0 ; i < len ; i ++ ) {
            String s1 = getPalindrome(s, i, i);
            String s2 = getPalindrome(s, i, i+1);
            if (s1.length() > longest) {
                longest = s1.length();
                res = s1;
            }
            if (s2.length() > longest) {
                longest = s2.length();
                res = s2;
            }
        }
        return res;
    }
    
    private int getMax(int a, int b) {
        return a > b ? a : b;
    }
    
    private String getPalindrome(String s, int i, int j) {
        int len = s.length();
        while (i >= 0 && j < len) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        return s.substring(i+1, j);
    }
}
