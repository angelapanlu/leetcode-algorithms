//Solution 1
class AddDigits {
    public int addDigits(int num) {
        int res = num;
        while (num / 10 != 0) {
            res = 0;
            int tmp = num;
            while (tmp != 0) {
                res += tmp%10;
                tmp /= 10;
            }
            num = res;
        }
        return res;
    }
}

//Solution 2
class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}
