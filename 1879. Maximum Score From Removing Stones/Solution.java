class Solution {
    public int maximumScore(int a, int b, int c) {
        
        int count=0;
        while( true )  { 

            if( ( a==0 && b==0) || ( b==0&&c==0) || ( c==0&&a==0) ) break;

            if( a >= b && a>=c  )  {  // a boro

                if( b>=c) { 
                    a--;b--;
                }else { 
                    a--;c--;
                }


            } else if ( b>=a && b>=c ) { //b boro

                if( a>=c) { 
                   b--;a--;
                }else { 
                    b--;c--;
                }

            }else if ( c>=a && c>= b) { //c boro

                if( b>=a) { 
                    c--;b--;
                }else { 
                    c--;a--;
                }

            }
            count++;

        }

        return count;

    }
}