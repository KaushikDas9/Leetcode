class Solution {

    public boolean isVowelWord ( String str ) { 

            int n = str.length();
            if( ( str.charAt(0)=='a' || str.charAt(0)=='e' || 
                  str.charAt(0)=='i' || str.charAt(0)=='o' || 
                  str.charAt(0)=='u') 

                                && 

                  ( str.charAt(n-1)=='a' || str.charAt(n-1)=='e' || 
                  str.charAt(n-1)=='i' || str.charAt(n-1)=='o' || 
                  str.charAt(n-1)=='u')  ) { 

                    return true;
                  }

            return false;
    }

    public int[] vowelStrings(String[] words, int[][] queries ) {

    
        int[] prefix = new int[words.length+1];
        int[] ans = new int[queries.length];
        int count =0;
        for ( int i=0;i<words.length;i++ ) {

            if( isVowelWord(words[i]) ) { 
                count++;
                prefix[i+1]=count;
            }else { 
                prefix[i+1]=count;
            }
            
        }

        for (int j = 0; j < queries.length; j++) {
            int l = queries[j][0];
            int r = queries[j][1];
            ans[j] = prefix[r + 1] - prefix[l];
        } 
        return ans;

    }
}

// [1,1,2,3,4]
// [0,1,2,3,4]



















        //  int n    = queries.length;
        // int ind   = 0;
        // int[] ans = new int[n];

        // for ( int i=0;i<queries.length;i++ ) { 

        //     int left  = queries[i][0];
        //     int right = queries[i][1];
        //     int temp  = 0;

        //     for ( int j=left;j<=right;j++ ) { 

        //         if( isVowelWord( words[j] ) ) { 
        //             temp++;
        //         }

        //     }  

        //     ans[ind++] =temp;

        // }

        // return ans;