class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for( int i=0;i<s.length();i++ ) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int max=Integer.MIN_VALUE;
        char max_c='-';
        for( Map.Entry<Character,Integer> entry : map.entrySet() ) {

                if( entry.getValue()>max) {
                    max= entry.getValue();
                    max_c=entry.getKey();
                }
        }

        if(max > ((s.length()+1)/2) ) return "";
        char[] ans = new char[s.length()] ;
        int index=0;

        for( int i=0;i<max;i++ ) {
            ans[index] = max_c;
            index +=2;
         
        }
        map.remove(max_c);

        for( char c : map.keySet()) {

            if( index>=s.length() )  index=1;

            for( int i=0;i<map.get(c);i++ ) {
                 if( index>=s.length() )  index=1;
                 ans[index]=c;
                 index +=2;

            } 
        }

        return new String(ans);
    }
}