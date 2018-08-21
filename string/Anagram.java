//Solution 1
class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c)-1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        if (map.keySet().size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

//Solution 2
class Solution {
    public boolean isAnagram(String s, String t) {
        int CHARACTER_NUM = 256;
        int[] arr1 = new int[CHARACTER_NUM];
        int[] arr2 = new int[CHARACTER_NUM];
        for (char c : s.toCharArray()) {
            arr1[c]++;
        }
        for (char c : t.toCharArray()) {
            arr2[c]++;
        }
        for (int i = 0 ; i < CHARACTER_NUM ; i ++ ) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
