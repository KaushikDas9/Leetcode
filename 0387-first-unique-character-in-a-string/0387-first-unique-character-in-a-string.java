class Solution {
    public int firstUniqChar(String s) {

       int arr[] = new int[26] ;

       for( char i : s.toCharArray() ) { 

           arr[i-'a']++;
       }
       
       for( int i=0;i<s.length();i++ ) { 

          if( arr[ s.charAt(i) -'a'] == 1 ) return i ;
       }
    

        // System.out.println(Arrays.toString(arr));
        return -1;
    }
}