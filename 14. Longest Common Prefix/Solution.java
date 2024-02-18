class Solution {
    public String longestCommonPrefix(String[] strs) {
        
            int n = strs.length;
           if( n==1 ) return strs[0];

           String ans= "";
           for( int i=0;i<Math.min( strs[0].length(),strs[1].length() );i++ )  { 

            if( strs[0].charAt(i) == strs[1].charAt(i) ) { 
                ans += String.valueOf(strs[0].charAt(i));
               
            }else{ break;}

           }

           if( n==2 ) return ans;

           for( int i=2;i<n;i++ ) { 

               if( strs[i].length() == 0 ) return "";

              for( int j=0;j<Math.min( strs[i].length(),ans.length() );j++ )  { 


                
                if( strs[i].charAt(j) != ans.charAt(j) ) {

                  ans = ans.substring(0,j);
                  break;
                  
                }


                if( j==strs[i].length()-1 && strs[i].length()< ans.length() ) { 
                    ans = ans.substring(0,j+1);
                }
             } 
           }

           return ans;
            
    }
}