//Implement atoi to convert a string to an integer.

class Atoi {

    public int myAtoi(String str) {
        if (str == null || str.trim().length() < 1) {
            return 0;
        }
        str = str.trim();
        boolean pos = true;
        if (str.charAt(0) == '-') {
            pos = false;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long res = 0;
        for (int i = 0 ; i < str.length(); i ++ ) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                break;
            }
            res *= 10;
            res += str.charAt(i) - '0';
            if (res >= Integer.MAX_VALUE && pos) {
                return Integer.MAX_VALUE;
            }
            if (res*(-1) <= Integer.MIN_VALUE && !pos) {
                return Integer.MIN_VALUE;
            }
        }
        if (res > 0 && !pos) {
            res *= -1;
        }
        return (int)res;
    }
}
