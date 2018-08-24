class ReverseString {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0 ; i < len/2 ; i ++ ) {
            char tmp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = tmp;
        }
        return new String(arr);
    }
}
