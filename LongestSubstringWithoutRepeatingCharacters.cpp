
// LeetCode 3: Longest Substring Without Repeating Characters
// Given a string s, return the length of the longest substring without repeating characters.

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        // freq[c] stores the count of character c in the current sliding window.
        int freq[128] = {0};
        int maxLength = 0;

        // Window boundaries [i, j]
        int i = 0;
        int j = 0;

        while (j < s.size()) {
            // Expand the window by adding s[j].
            freq[s[j]]++;

            // If the current character appears more than once, move the left boundary
            // forward until the substring becomes unique again.
            while (freq[s[j]] > 1 && i < j) {
                freq[s[i]]--;
                i++;
            }

            // The window [i, j] is now a substring without duplicate characters.
            maxLength = max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }
};