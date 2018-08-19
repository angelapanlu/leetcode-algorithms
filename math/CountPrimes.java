class CountPrimes {
    public int countPrimes(int n) {
        int[] arr = new int[n];
        for (int i = 2 ; i <= Math.sqrt(n) ; i ++ ) {
            for (int j = 2 ; j <= n/i ; j ++ ) {
                arr[i*j-1] = 1;
            }
        }
        int res = 0;
        for (int i = 1 ; i < n-1 ; i ++ ) {
            if (arr[i] == 0) {
                res++;
            }
        }
        return res;
    }
}
