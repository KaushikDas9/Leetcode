class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];

        pre[0] = 0;
        for (int i = 1; i <= n; i++) { 
            if (customers.charAt(i-1) == 'N') pre[i] = pre[i-1] + 1;
            else pre[i] = pre[i-1];
        }

        suf[n] = 0;
        for (int i = n-1; i >= 0; i--) { 
            if (customers.charAt(i) == 'Y') suf[i] = suf[i+1] + 1;
            else suf[i] = suf[i+1];
        }

        int ans = 0;
        int minPenalty = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) { 
            if (pre[i] + suf[i] < minPenalty) { 
                minPenalty = pre[i] + suf[i];
                ans = i;
            }
        }
        return ans;
    }
}