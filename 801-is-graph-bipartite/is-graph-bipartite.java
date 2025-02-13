class Solution {

    public static boolean dfs ( int[][] graph , int node , int col , int[] color  ) { 

        color[node]= col;

        for ( int i:graph[node] ) { 
            if( color[i]==-1 ) { 
                if(dfs(graph,i,1-col,color ) == false) return false;
            } else if( col==color[i] ) { 
                return false;
            }
        }

        return true;

    }
    public boolean isBipartite(int[][] graph) {
        
        int v = graph.length;
        int m = graph[0].length;

        int[] color = new int[v];
        for ( int i=0;i<v;i++ ) color[i]=-1;

        for ( int i=0;i<v;i++ ) { 
            if(color[i]==-1) {
                if(dfs(graph,i,0,color)==false) return false;
            }
        }

        return true;
    }
}