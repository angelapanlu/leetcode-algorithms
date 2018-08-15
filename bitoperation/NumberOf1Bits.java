public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n = n >>> 1; //use unsigned operation so even if there is sign this while loop can still finish
        }
        return res;
    }
}
