//Given a string, find the length of the longest substring without repeating characters.

class LongestSubstring {
    /*
    * Use two pointers to reduce time complexity from O(NlogN) to O(N)
    */
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (j < s.length()) {
            if (set.contains(s.charAt(j))) {
                longest = getMax(set.size(), longest);
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
            }
        }
        return getMax(longest, set.size());
    }
    
    private int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
