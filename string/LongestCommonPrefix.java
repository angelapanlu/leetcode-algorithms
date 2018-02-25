//longest comon prefix: Write a function to find the longest common prefix string amongst an array of strings.

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int num = strs.length;
        if (num == 0) {
            return "";
        }
        
        for (int j = 0 ; j < strs[0].length() ; j ++ ) {
            for (int i = 1 ; i < num ; i ++ ) {
                if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }
}
