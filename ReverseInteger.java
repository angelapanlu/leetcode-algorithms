//Given a 32-bit signed integer, reverse digits of an integer.

class ReverseInteger {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res *= 10;
            res += x%10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        
        return (int)res;
    }
}
