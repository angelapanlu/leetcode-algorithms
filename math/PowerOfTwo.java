class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        int i = 1;
        if (n == 1) {
            return true;
        }
        while (i <= n/2) {
            i *= 2;
            if (i == n) {
                return true;
            } else if (i > n) {
                return false;
            } else {
                continue;
            }
        }
        return false;
    }
}
