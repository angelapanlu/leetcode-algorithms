class ReverseVowels {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] arr = s.toCharArray();
        int len = arr.length;
        int i = 0, j = len-1;
        while (i < j) {
            if (set.contains(arr[i]) && set.contains(arr[j])) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            } else {
                if (!set.contains(arr[i])) {
                    i++;
                }
                if (!set.contains(arr[j])) {
                    j--;
                }
            }
        }
        return new String(arr);
    }
}
