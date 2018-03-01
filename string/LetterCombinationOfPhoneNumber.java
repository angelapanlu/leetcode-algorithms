//Given a digit string, return all possible letter combinations that the number could represent.

class LetterCombinationOfPhoneNumber {
    public Map<Character, List<Character>> initializeMap() {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('1', new ArrayList<>());
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        map.put('0', Arrays.asList(' '));
        return map;
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        Map<Character, List<Character>> map = initializeMap();
        for (int i = 0 ; i < digits.length() ; i ++ ) {
            List<Character> list = map.get(digits.charAt(i));
            if (res.size() == 0) {
                res.add("");
            }
            List<String> tmp = new ArrayList<String>();
            for (String str : res) {
                for (int j = 0 ; j < list.size() ; j ++ ) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(list.get(j));
                    tmp.add(sb.toString());
                }
            }
            res = tmp;
        }
        return res;
    }
}
