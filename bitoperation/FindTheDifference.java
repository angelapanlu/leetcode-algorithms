//Given two strings s and t which consist of only lowercase letters.

//String t is generated by random shuffling string s and then add one more letter at a random position.

//Find the letter that was added in t.

class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return res;
    }
}
