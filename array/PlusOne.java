class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int cnt = n-1; //carry number position
        for (int i = n-1 ; i >= 0 ; i -- ) {
            if (digits[i] == 9 && cnt == i) {
                cnt -- ;
                digits[i] = 0;
            } else  {
                digits[i] += 1;
                return digits;
            } 
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}
