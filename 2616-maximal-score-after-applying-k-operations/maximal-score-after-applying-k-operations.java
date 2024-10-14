class Solution {
    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        for(int i:nums) pq.add((double) i);
        long ans = 0;
        
        while( k-->0 ) { 
           
            double temp = pq.poll();
            ans +=  temp;
            pq.add(Math.ceil(temp / 3.0));
     
        }

        return ans;
    }
}