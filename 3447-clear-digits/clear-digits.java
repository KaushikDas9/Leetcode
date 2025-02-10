class Solution {


    public static boolean isDigit( char c ) {
        if( c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||
            c=='6'||c=='7'||c=='8'||c=='9'||c=='0'
         ) return true;
         else return false;
    }

      public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);

       
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
               
                if (i > 0) { 
                    str.delete(i - 1, i + 1); 
                    i -= 2;
                } else {
                    str.deleteCharAt(i);
                    i--; 
                }
            }
        }

        return str.toString();
    }
}
