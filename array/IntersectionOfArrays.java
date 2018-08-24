class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }
        int[] arr = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            arr[i++] = num;
        }
        return arr;
    }
}
