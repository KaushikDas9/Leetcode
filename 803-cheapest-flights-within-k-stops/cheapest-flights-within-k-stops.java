

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Build adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // PriorityQueue to store (cost, node, remaining stops)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, src, k + 1}); // Start with (cost=0, node=src, remaining stops=k+1)

        // Distance matrix to store the minimum cost to reach each node with a given number of stops
        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[src][k + 1] = 0; // Cost to reach the source node with k+1 stops is 0

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int node = current[1];
            int stops = current[2];

            // If we reach the destination, return the cost
            if (node == dst) {
                return cost;
            }

            // If no more stops are allowed, skip
            if (stops == 0) {
                continue;
            }

            // Explore all neighbors
            for (int[] neighbor : adj.get(node)) {
                int dest = neighbor[0];
                int price = neighbor[1];

                // Calculate the new cost
                int newCost = cost + price;

                // If the new cost is better, update the distance and add to the queue
                if (newCost < dist[dest][stops - 1]) {
                    dist[dest][stops - 1] = newCost;
                    pq.add(new int[]{newCost, dest, stops - 1});
                }
            }
        }

        // If no path is found, return -1
        return -1;
    }
}