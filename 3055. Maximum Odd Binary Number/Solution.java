class Solution {
    public String maximumOddBinaryNumber(String s) {

        int arr[] = new int[2];

        for( int i=0;i<s.length();i++ )  { 
            if( s.charAt(i) == '1' ) { 
                arr[1] = arr[1] + 1 ;
            }else { 
                arr[0] = arr[0] + 1 ;
            }
        }

        String ans = "";

        if( arr[1] == 1 ) { 
            for( int i=0;i<arr[0];i++ ) { 
                ans += '0';
            }
            ans += '1';
        }


        if( arr[1] > 1 ) { 

            for( int i=0;i<arr[1]-1;i++ ) { 
                ans += '1';
            }
            for( int i=0;i<arr[0];i++ ) { 
                ans += '0';
            }
            ans += '1';

        }
        if( arr[1] < 1) { 
            return s;
        }

        return ans;
        
    }
}