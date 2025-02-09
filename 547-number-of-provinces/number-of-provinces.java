class Solution {

    public static void dfs( ArrayList<ArrayList<Integer>> adj , int node ,boolean[] vis ) {

        vis[node]=true;
        for ( int i:adj.get(node) ) { 
            if(!vis[i]) {
                dfs(adj,i,vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for ( int i=0;i<v;i++) adj.add(new ArrayList<>());

        for( int i=0;i<v;i++ ) {
            for ( int j=0;j<v;j++ ) {

                if( isConnected[i][j] == 1 ) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean vis[] = new boolean[v];
        int count=0;
        for ( int i=0;i<v;i++ ) {
            if(!vis[i]){
                count++;
                dfs(adj,i,vis);
            }
        }

        return count;

    }
}
//arr[0][0]=1 0->0
//arr[0][1]=1 0->1