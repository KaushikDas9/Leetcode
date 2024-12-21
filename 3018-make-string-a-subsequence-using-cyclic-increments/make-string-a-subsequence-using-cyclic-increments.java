class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        boolean[] incremented = new boolean[str1.length()];
        
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else if (!incremented[i] && (str1.charAt(i) + 1 == str2.charAt(j) || 
                                            (str1.charAt(i) == 'z' && str2.charAt(j) == 'a'))) {
                incremented[i] = true;
                i++;
                j++;
            } else {
                i++;
            }
        }
        
        return j == str2.length();
    }
}