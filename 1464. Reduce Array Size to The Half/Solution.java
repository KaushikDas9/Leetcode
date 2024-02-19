class Solution {
    public int minSetSize(int[] arr) {


        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i=0;i<arr.length;i++ ) { 

            map.put( arr[i], map.getOrDefault( arr[i],0 )+1);
        } 

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for( Map.Entry<Integer,Integer> entry : map.entrySet() ) { 

            pq.add(entry.getValue());
        }

        int temp =0;int count=0;
        while(  temp < arr.length/2 ) { 

            temp += pq.poll();count++;
        }

        return count;

    }
}