class Solution {
    public boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (str[i] != str[j]) {
                return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean isPalindrome(char[] str, int i, int j) {
        while (i < j) {
            if (str[i] != str[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}