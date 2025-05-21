class Solution 
{

    public static void makeZero( int row,int col, int[][] arr ) { 

        //for  row (1,1)
        for( int i=0;i<arr[0].length;i++ ) { 
            arr[row][i]=0;
        } 
        for( int i=0;i<arr.length;i++ ) { 
            arr[i][col]=0;
        } 
    }
    public void setZeroes(int[][] matrix)
    {
        
        int row= matrix.length ;
        int col= matrix[0].length;
        List<List<Integer>> list = new ArrayList<>();

            for( int i=0;i<row;i++)
            {
                for( int j=0;j<col;j++ )
                {   
                    if( matrix[i][j] == 0 ) { 
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);temp.add(j);
                        list.add(temp);
                    }    
                }
            }


            for( int i=0;i<list.size();i++ ) { 
                makeZero(list.get(i).get(0),list.get(i).get(1),matrix);
            }
            // System.out.println(list.get(0).get(0));

            


    }
}