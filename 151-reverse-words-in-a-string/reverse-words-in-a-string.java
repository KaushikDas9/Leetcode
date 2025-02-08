class Solution {
    public String reverseWords(String s) {
        List<String> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;

        // Split the string into words
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                index = i;
                while(i < s.length() && s.charAt(i) != ' ' ) { 
                    i++;
                }
                temp.add(s.substring(index, i));
            }
        }
        // Add the last word
        // temp.add(s.substring(index, s.length()));

        // Reverse the list of words
        for (int i = temp.size() - 1; i >= 0; i--) {
            sb.append(temp.get(i));
            if (i > 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}