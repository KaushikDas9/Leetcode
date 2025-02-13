class Solution {

     public static boolean dfs(int node, int[] vis, int[] recStack, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1; 
        recStack[node] = 1; 
        
        
        for (int i : adj.get(node)) {
            if (vis[i] == 0) { 
                if (dfs(i, vis, recStack, adj)==false) {
                    return false; 
                }
            } else if (recStack[i] == 1) { 
                return false; 
            }
        }
        
        recStack[node] = 0; // Remove the node from the recursion stack
        return true; // No cycle detected
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int V =numCourses;
        int[] vis = new int[V]; 
        int[] recStack = new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] i : prerequisites) {
            adj.get(i[1]).add(i[0]);
        }
        
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) { 
                if (dfs(i, vis, recStack, adj)==false) {
                    return false; 
                }
            }
        }
        
        return true;
    }
}

