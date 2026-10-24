// LeetCode 678. Valid Parenthesis String (Medium)
// Approach: greedy - track the min (lo) and max (hi) number of open brackets possible.
// Time: O(n)  Space: O(1)

class Solution {
    public boolean checkValidString(String s) {
        int lo = 0, hi = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') { lo++; hi++; }
            else if (c == ')') { lo--; hi--; }
            else { lo--; hi++; }            // '*' can be ')', '(' or empty
            if (hi < 0) return false;
            if (lo < 0) lo = 0;
        }
        return lo == 0;
    }
}
