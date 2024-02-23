class Solution {

    public static boolean find( StringBuilder num ,int tar , int  index , int sum ) { 

        if( index == num.length() ) {    
           if( sum == tar ) return true;
           return false;
        }

        for( int i=1 ; i<num.length() - index +1 ;i++ ) { 

            int temp =Integer.parseInt( num.substring( index ,index+i ) );
            sum += temp ;
            if( find( num,tar,index+i,sum  ) ) return true; 
            sum -= temp;

        }       


        return false;
    }


    public int punishmentNumber(int n) {

        int ans =0;
        StringBuilder str ;
        for( int i=1;i<=n;i++ ) {

             int num = i*i;    
             str = new StringBuilder( String.valueOf(num));
              
             if( find( str, i ,0,0 ) )  ans+=num;     
             
        }

        return ans;
    }
}