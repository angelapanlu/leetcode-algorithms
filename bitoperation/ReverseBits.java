public class ReverseBits {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0 ; i < 32 ; i ++ ) { //32 bits in total so 0-31 
            res += (n & 1); //get last bit
            n = n >>> 1; //use unsigned shift to shift right
            if (i < 31) { //shift left except the left most bit
                res = res << 1;
            }
        }
        return res;
    }
}
