class Solution {
    public int findKthLargest(int[] nums, int k) {
        

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for( int i :nums ) pq.add(i);

        int ans=(int)1e9;
        while( k-->0) { 
            ans = pq.poll();
        }

    return ans;
        
    }
}