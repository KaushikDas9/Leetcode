class Solution {
    public int minimumPushes(String word) {
        
        int n = word.length();

        // s-O(26)
        int[] arr = new int[26];

        // t-O(n)
        for(char c : word.toCharArray()) arr[c - 'a']++; 

        // t- nlogn -> 26log26 -> 1
        Arrays.sort(arr);

        int ans = 0;
        int count = 0;

        // t -> 4 * 8 -> 32 -> 1
        for (int i = 25; i >= 0; i--) {
            if (arr[i] == 0) break;

            int presses = (count / 8) + 1;
            ans += arr[i] * presses;
            
            count++;
        }

        return ans;
    }
}