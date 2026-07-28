class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        char mid = 0;
        StringBuilder leftHalf = new StringBuilder();

        // Step 2: Trim by 2 and collect left half + mid character
        for (int i = 0; i < 26; i++) {
            while (arr[i] > 1) {
                leftHalf.append((char) ('a' + i));
                arr[i] -= 2; // Trim down by 2
            }

            // If 1 remains, this is our middle character
            if (arr[i] == 1) {
                mid = (char) ('a' + i);
            }
        }

        // Step 3: Build the full palindrome
        StringBuilder result = new StringBuilder(leftHalf);
        if (mid != 0) {
            result.append(mid);
        }
        // Mirror the left half to complete the palindrome
        result.append(new StringBuilder(leftHalf).reverse());

        return result.toString();
    }
}