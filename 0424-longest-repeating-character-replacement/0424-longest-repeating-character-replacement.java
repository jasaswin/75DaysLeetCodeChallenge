class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxWindow = 0;

        for (int right = 0; right < s.length(); right++) {

            // include current character
            freq[s.charAt(right) - 'A']++;

            // track max frequency in current window
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            // if replacements needed > k, shrink window
            if (windowLength - maxfreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
}
