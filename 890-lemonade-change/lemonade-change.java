class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five=0,ten=0,twenty=0;
        int n=bills.length;
        if( bills[0]==10 || bills[0]==15 ) return false;

        for ( int i=0;i<n;i++ ) { 

            if( bills[i]==5 ) five++;

            if( bills[i]==10 ) { 
                if( five>=1 ) { 
                    five--;
                    ten++;
                }
                else return false;
            }

            if( bills[i]==20 ) {
                if( ten>=1 && five>=1) { 
                    ten--;
                    five--;
                    twenty++;
                } else if ( five>=3) { 
                    five -=3;
                    twenty++;
                } else { return false;}
            }
        }

        return true;

    }
}