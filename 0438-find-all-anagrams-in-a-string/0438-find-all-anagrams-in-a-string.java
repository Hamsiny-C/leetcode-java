class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) {
            return res;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char ch1 = p.charAt(i);
            char ch2 = s.charAt(i);
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);
            } else {
                map2.put(ch2, 1);
            }
        }
        if (map1.equals(map2)) {
            res.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            char old = s.charAt(i - p.length());
            if (map2.get(old) == 1) {
                map2.remove(old);
            } else {
                map2.put(old, map2.get(old) - 1);
            }
            char ch = s.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
            if (map1.equals(map2)) {
                res.add(i - p.length() + 1);
            }
        }
        return res;
    }
}