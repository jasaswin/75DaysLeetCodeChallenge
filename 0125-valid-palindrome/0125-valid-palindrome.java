class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            // Move the left pointer to skip non-alphanumeric characters
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // Move the right pointer to skip non-alphanumeric characters
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Compare characters at left and right pointers
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;  // Not a palindrome
            }

            // Move both pointers
            l++;
            r--;
        }

        return true;  // String is a palindrome
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Is Palindrome (Test 1): " + solution.isPalindrome(test1));  // Output: true
        System.out.println("Is Palindrome (Test 2): " + solution.isPalindrome(test2));  // Output: false
        System.out.println("Is Palindrome (Test 3): " + solution.isPalindrome(test3));  // Output: true
    }
}