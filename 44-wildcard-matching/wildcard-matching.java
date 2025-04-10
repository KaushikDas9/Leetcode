class Solution {

    public static boolean find( int i , int j , String s1 , String s2 , Boolean[][] dp ) { 

        if( i<0 && j<0 ) return true;
        if( i<0 && j>=0 ) return false;
        if( i>=0 && j<0 ) { 
            for( int k=0;k<=i;k++ ) {
                if( s1.charAt(k) != '*' ) return false;
            }
            return true;
        }

        if( dp[i][j] != null ) return dp[i][j];

        if( s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == '?' ) {
            return dp[i][j] = find( i - 1 , j - 1 , s1 , s2 , dp );
        } 
        else if( s1.charAt(i) == '*' ) { 
            return dp[i][j] = find( i - 1 , j , s1 , s2 , dp ) 
                    || find( i  , j - 1 , s1 , s2 , dp );
        }

        return dp[i][j] = false;

    }

    public boolean isMatch(String s, String p) {

        int n = p.length();
        int m = s.length();
        Boolean[][] dp = new Boolean[n+1][m+1];
        return find( n - 1 , m - 1 , p , s , dp );
    }
}