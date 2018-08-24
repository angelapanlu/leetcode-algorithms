class UniqueCharacter {
    public int firstUniqChar(String s) {
        int NUM = 256;
        int[] arr = new int[NUM];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        for (int i = 0 ;  i < s.length() ; i ++ ) {
            char c = s.charAt(i);
            if (arr[c] == 1) {
                return i;
            }
        }
        return -1;
    }
}
