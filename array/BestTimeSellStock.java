class BestTimeSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        int[] max = new int[n];
        int[] min = new int[n];
        min[0] = prices[0];
        max[n-1] = prices[n-1];
        for (int i = 1 ; i < n ;  i++ ) {
            min[i] = Math.min(prices[i], min[i-1]);
        }
        for (int i = n-2 ; i >= 0 ; i-- ) {
            max[i] = Math.max(prices[i], max[i+1]);
        }
        int res = 0;
        for (int i = 0 ; i < n ; i ++ ) {
            res = Math.max(res, max[i]-min[i]);
        }
        return res;
    }
}
