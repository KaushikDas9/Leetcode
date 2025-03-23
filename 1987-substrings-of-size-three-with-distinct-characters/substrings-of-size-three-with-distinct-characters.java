class Solution {
    // Time = O(N)
    // Space = O(1)
    public int countGoodSubstrings(String s) {

        int n=s.length();
        if(n<=2) return 0;
        char a  = s.charAt(0);
        char b  = s.charAt(1);
        char c  = s.charAt(2);

        int ans=0;
        if( a!=b&&b!=c&&c!=a  ) ans++;
        for ( int i=3;i<n;i++ ) { 
            a=b;
            b=c;
            c=s.charAt(i);
            if( a!=b&&b!=c&&c!=a  ) ans++;
        }

        return ans;
    }
}