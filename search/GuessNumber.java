/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        int i = 1, j = n;
        while (i <= j) {
            int mid = i + (j-i)/2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            } else if (g > 0) {
                i = mid+1;
            } else { //g<0
                j = mid-1;
            }
        }
        return 0;
    }
}
