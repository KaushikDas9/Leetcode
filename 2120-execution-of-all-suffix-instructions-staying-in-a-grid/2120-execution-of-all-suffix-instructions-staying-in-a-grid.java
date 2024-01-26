class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {

        int[] ans = new int[s.length()];

         

        for ( int i=0;i<s.length();i++ ) {

            int row = startPos[0];
            int col = startPos[1];
            int count =0 ;
            for( int j=i;j<s.length();j++ ) { 


                if( s.charAt(j)=='R'  ) { 
                    col++;
                    if( col < n ) count++;
                    else break ;
                }
                else if ( s.charAt(j)=='L' ) {
                    col--; 
                    if( col  >= 0 ) count++;
                    else break ;
                }
                else if( s.charAt(j)=='U' ) {
                    row--;
                    if( row  >= 0 ) count++;
                    else break ;
                }
                else{ 
                    row++;
                    if( row  < n ) count++;
                    else break ;
                } 
                
            }

            ans[i]=count;
        }
        
        return ans;
    }
}



