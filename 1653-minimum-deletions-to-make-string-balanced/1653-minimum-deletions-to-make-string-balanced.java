class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;     // number of 'b's so far
        int deletions = 0;  // minimum deletions needed
        
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                countB++;
            } else { // c == 'a'
                // either delete this 'a' or delete all previous 'b's
                deletions = Math.min(deletions + 1, countB);
            }
        }
        return deletions;
    }
}

