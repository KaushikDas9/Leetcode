class Solution {
    public int numberOfSubstrings(String s) {

        int[] arr = new int[]{-1,-1,-1};
        int j=0,ans=0;
        for ( int i=0;i<s.length();i++ ) { 
            
            if( s.charAt(i)=='a') arr[0]=i;
            else if( s.charAt(i)=='b') arr[1]=i;
            else arr[2]=i;

            if( arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1 ) {
                ans += 1+Math.min( arr[0],Math.min(arr[1],arr[2]) );
            }

        }

        return ans;

    }
}