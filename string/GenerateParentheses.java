//22. Generate Parentheses: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add("");
        for ( int i = 0 ; i < n ; i ++ ) {
            Set<String> tmp = new HashSet<>();
            for (String str : set) {
                for (int j = 0 ; j <= str.length() ; j ++ ) {
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(j, "()");
                    tmp.add(sb.toString());
                }
            }
            set = tmp;
        }
        for (String str : set) {
            list.add(str);
        }
        return list;
    }
}
