class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int NUM = 256;
        int[] arr = new int[NUM];
        for (char c : magazine.toCharArray()) {
            arr[c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (arr[c] > 0) {
                arr[c]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
