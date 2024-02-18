class Solution {
    public String lastNonEmptyString(String s) {
        
        
        
        HashMap< Character,Integer> map = new HashMap<>();
        
        for( int i=0;i<s.length();i++ )  { 
            
            map.put( s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1 );
        }
        
        int maxValue =-1;
        
        for( Map.Entry<Character,Integer> entry : map.entrySet() ) { 
            
            maxValue = Math.max( entry.getValue(),maxValue );
        }
        
        String ans = "";
        
        
        for( Map.Entry<Character,Integer> entry : map.entrySet() ) { 
            
            if( entry.getValue()==maxValue ) {
                ans += String.valueOf(entry.getKey());
            }
        }
        
        HashSet<String> cheak = new HashSet();
        
        for( int i=0;i<ans.length();i++ ) { 
            cheak.add( ( String.valueOf( ans.charAt(i) )) );
        }
        
        String ans2 = "";
        
        for(  int i =s.length()-1; i >=0;i-- ) { 
            
            String temp =String.valueOf( s.charAt(i) );
            
            if(  cheak.contains( temp)  && !ans2.contains(temp)) ans2 += temp ;
            if( ans2.length() == ans.length() ) break;
        }
        
        StringBuilder ans3 = new StringBuilder(ans2);
        
        return ans3.reverse().toString();
    }
}