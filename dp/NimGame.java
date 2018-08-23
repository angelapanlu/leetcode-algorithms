/*
*You are playing the following Nim Game with your friend: There is a heap of stones on the table, 
*each time one of you take turns to remove 1 to 3 stones. 
*The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
*/
//Solution 1 -- time exceeds
class NimGame {
    public boolean canWinNim(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return true;
        }
        return !canWinNim(n-1) || !canWinNim(n-2) || !canWinNim(n-3);
    }
}

//Solution 2 -- Memory exceeds
class NimGame {
    public boolean canWinNim(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return true;
        }
        boolean[] arr = new boolean[n+1];
        arr[1] = true;
        arr[2] = true;
        arr[3] = true;
        for (int i = 4 ; i <= n ; i ++ ) {
            arr[i] = !arr[i-1] || !arr[i-2] || !arr[i-3]; 
        }
        return arr[n];
    }
}

//Solution 3
class NimGame {
    public boolean canWinNim(int n) {
        if (n % 4 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
