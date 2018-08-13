class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();
        int len = s.length();
        int i = 0, j = len-1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
