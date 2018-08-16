class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1) {
            int tmp = 0;
            while (n != 0) {
                tmp += Math.pow(n%10, 2);
                n /= 10;
            }
            if (set.contains(tmp)) {
                return false;
            }
            set.add(tmp);
            n = tmp;
        }
        return true;
    }
}
