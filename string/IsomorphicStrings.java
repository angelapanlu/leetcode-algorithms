//Solution 1

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        int m = s.length();
        int n = t.length();
        if (m != n) {
            return false;
        }
        for (int i = 0 ; i < m ; i ++ ) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (map1.containsKey(c)) {
                if (map1.get(c) != d) {
                    return false;
                }
            } else {
                map1.put(c, d);
            }
            if (map2.containsKey(d)) {
                if (map2.get(d) != c) {
                    return false;
                }
            } else {
                map2.put(d, c);
            }
        }
        return true;
    }
}


//Solution 2
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        int m = s.length();
        int n = t.length();
        if (m != n) {
            return false;
        }
        for (int i = 0 ; i < m ; i ++ ) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (map1.containsKey(c)) {
                if (map1.get(c) != d) {
                    return false;
                } 
            } else {
                if (map1.containsValue(d)) {
                    return false;
                } else {
                    map1.put(c, d);
                }
            }
            
        }
        return true;
    }
}

//Solution 3
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        int m = s.length();
        int n = t.length();
        if (m != n) {
            return false;
        }
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0 ; i < m ; i ++ ) {
            if (arr1[s.charAt(i)] != arr2[t.charAt(i)]) {
                return false;
            }
            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
