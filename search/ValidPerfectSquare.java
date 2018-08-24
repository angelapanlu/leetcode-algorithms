//Given a positive integer num, write a function which returns True if num is a perfect square else False.
//Solution 1
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int n = 2;
        while (n < num) {
            if (n < num/n) {
                n *= 2;
            } else {
                n /= 2;
                break;
            } 
        }
        
        for (int i = n ; i < num ; i ++ ) {
            if (i > num/i) {
                return false;
            } else if (i*i == num) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}

//Solution 2
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (mid > num/mid) {
                high = mid-1;
            } else if (mid*mid == num) {
                return true;
            } else {
                low = mid+1;
            }
        }
        return false;
    }
}
