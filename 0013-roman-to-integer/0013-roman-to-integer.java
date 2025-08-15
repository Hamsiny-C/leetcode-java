class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Step 2: Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i)); // current symbol value
            int next = 0;

            // Step 3: If there's a next character, get its value
            if (i + 1 < s.length()) {
                next = romanMap.get(s.charAt(i + 1));
            }

            // Step 4: If current < next → subtract. Otherwise → add.
            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}