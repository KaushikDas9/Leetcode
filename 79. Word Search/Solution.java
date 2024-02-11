class Solution {

    public boolean find( int row,int col,int index,char[][] board,String word ){

        int n = board.length;
        int m = board[0].length;

        if( index == word.length() ) return true ;
        if( row<0 || row>=n  || col<0 || col>=m || board[row][col] != word.charAt(index)  ) return false;

            char temp = board[row][col];
            board[row][col] = ' ';

            boolean has =  find(row,col+1,index+1,board,word) ||
                           find(row,col-1,index+1,board,word) ||
                           find(row+1,col,index+1,board,word) ||
                           find(row-1,col,index+1,board,word) ;

            board[row][col] = temp;
            return has;          
    }
    public boolean exist(char[][] board, String word) {

        for(  int i=0;i<board.length;i++) { 
            for( int j=0;j<board[0].length;j++ ) {
                if(find(i,j,0,board,word)) return true;
            }
        }
        return false ;
        
    }
}
