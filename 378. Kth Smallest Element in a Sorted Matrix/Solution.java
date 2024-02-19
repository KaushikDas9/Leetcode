class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        List<Integer> list = new ArrayList<>();

        for( int i=0;i<matrix.length;i++ ) { 

            for( int j=0;j<matrix.length;j++ ) { 

                list.add( matrix[i][j] );
            }
        }

        // while( k-->1) { 

        //     pq.poll();
        // }
        Collections.sort(list);
        return list.get(k-1);

    }
}