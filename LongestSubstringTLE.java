class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() < 1) {
			return 0;
		}
		int longest = 1;
		for (int i = 0 ; i < s.length()-1 ; i ++ ) {
			boolean added = false;
			Map<Character, Integer> map = new HashMap<>();
			map.put(s.charAt(i), i);
			for (int j = i+1 ; j < s.length() ; j ++ ) {
				if (map.containsKey(s.charAt(j))) {
					if (j-i > longest) {
						longest = j-i;
					}
					i = map.get(s.charAt(j));
					added = true;
					break;
				} else {
					map.put(s.charAt(j), j);
				}
			}
			if (!added) {
				if (map.keySet().size() > longest) {
					longest = map.keySet().size();
					break;
				}
			}
		}
		return longest;
	}
}
