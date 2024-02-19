class Solution {
    public int minStoneSum(int[] piles, int k) {
        

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (a,b)->b-a );

        for( int i:piles ) pq.add(i);

        while( k-->0) { 

            int temp = pq.poll();
             int temp1=temp - temp/2 ;
             pq.add(temp1);
        }

        int sum=0;

        while( !pq.isEmpty()) sum+=pq.poll();

        return sum;
    }
}