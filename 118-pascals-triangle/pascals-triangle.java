class Solution {
    public List<List<Integer>> generate(int numRows) {

        //Recursive Solution
        if( numRows==0 ) return new ArrayList<>();
        if(numRows==1 ) {
            List<List<Integer>> r = new ArrayList<>();
            r.add(Arrays.asList(1));
            return r;
        }


        List<List<Integer>> prev = generate(numRows-1);
        List<Integer> curr = new ArrayList<>();
        
        for( int i=0;i<numRows;i++ ) curr.add(1);
        
        for ( int i=1;i<numRows-1;i++ ) { 
            curr.set( i,prev.get(numRows-2).get(i-1) + prev.get(numRows-2).get(i) );
        }
        
        prev.add(curr);
        return prev;
    }
}