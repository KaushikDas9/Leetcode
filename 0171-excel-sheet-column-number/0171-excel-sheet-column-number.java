class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        if(columnTitle.length()==1) {return ((int)columnTitle.charAt(0))-64;}
        else {
            int j=1;
            for( int i=columnTitle.length()-2;i>=0;i-- ) {
                // sum = sum * (((int)columnTitle.charAt(i))-64);
                sum += Math.pow(26,j++)  *   (((int)columnTitle.charAt(i))-64);
                  
            }
            sum+=(((int)columnTitle.charAt(columnTitle.length()-1))-64);
        }
        
        return sum;
    }
}