class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        // Step 1: Transform the string
        // Insert special characters to handle even/odd palindromes uniformly
        // Example: "abba" -> "^#a#b#b#a#$"
        StringBuilder t = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#$");

        int n = t.length();
        int[] p = new int[n]; // Array to hold palindrome radii
        int center = 0, right = 0; // Current center and right boundary

        // Step 2: Main Manacher loop
        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i; // Mirror index with respect to current center

            if (i < right) {
                // Restrict radius if inside the current known palindrome
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Try to expand palindrome centered at i
            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            // If palindrome expanded past right boundary, update center and right
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // Step 3: Find longest palindrome
        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Step 4: Extract result from original string
        int start = (centerIndex - maxLen) / 2; // Map back to original string index
        return s.substring(start, start + maxLen);
    }
}