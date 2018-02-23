//Determine whether an integer is a palindrome. Do this without extra space.

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long res = 0;
        int org = x;
        while (x != 0) {
            res *= 10;
            res += x % 10;
            if (res > Integer.MAX_VALUE) {
                return false;
            }
            x /= 10;
        }
        if ((int) res == org) {
            return true;
        } else {
            return false;
        }
    }
}
