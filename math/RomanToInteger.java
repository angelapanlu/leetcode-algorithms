//Roman to integer

/*
* Table
* M     CM  D   CD  C   XC  L   XL  X   IX  V   IV  I
*1000   900 500 400 100 90  50  40  10  9   5   4   1
*/


class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC","CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        if (s.contains("CD")) {
            res += 400;
            s = s.replace("CD", "");
        }
        if (s.contains("XL")) {
            res += 40;
            s = s.replace("XL", "");
        }
        if (s.contains("IV")) {
            res += 4;
            s = s.replace("IV", "");
        }
        
        for (int i = 9 ; i >= 0 ; i --) {
            if (s.contains(I[i])) {
                res += i;
                s = s.replace(I[i], "");
                break;
            } 
        }
        for (int i = 9 ; i >= 0 ; i --) {
            if (s.contains(X[i])) {
                res += 10*i;
                s = s.replace(X[i], "");
                break;
            } 
        }
        for (int i = 9 ; i >= 0 ; i --) {
            if (s.contains(C[i])) {
                res += 100*i;
                s = s.replace(C[i], "");
                break;
            } 
        }
        for (int i = 3 ; i >= 0 ; i --) {
            if (s.contains(M[i])) {
                res += 1000*i;
                s = s.replace(M[i], "");
                break;
            } 
        }
        return res;
    }
}
