// LeetCode 856. Score of Parentheses (Medium)
// Approach: each core "()" at depth d is worth 2^d - add them up.
// Time: O(n)  Space: O(1)

class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0, depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') score += 1 << depth;
            }
        }
        return score;
    }
}
