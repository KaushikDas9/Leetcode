class Solution {

    public static int find( int n,int moves ) { 

        if( n <=0 ) return moves;
        return find( n-moves , moves+1 );
    }
    public int twoEggDrop(int n) {
        return find( n,1)-1;
    }
}