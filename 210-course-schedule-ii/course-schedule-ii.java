class Solution {

    public static boolean dfs ( ArrayList<ArrayList<Integer>> adj,int node,Stack<Integer> s,int vis[],int[] r  ) {

        vis[node] = 1;
        r[node]=1;
        for ( int i:adj.get(node) ) { 
            if( vis[i]==0 ) {
                if (dfs( adj,i,s,vis,r ) ) return true;
            } else if( r[i]==1  ) return true;
        }
        s.push(node);
        r[node]=0;
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        

        int v = numCourses ; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vis[] = new int[v];
        Stack<Integer> s = new Stack<>();
        int[] r = new int[numCourses];

        for ( int i=0;i<v;i++ ) adj.add(new ArrayList<>());

        for ( int[] i: prerequisites) { 
            adj.get(i[1]).add(i[0]);
        }


        for ( int i=0;i<v;i++  ) {
            if( vis[i] == 0 ) { 
                if(dfs(adj,i,s,vis,r)) return new int[0];
            }
        }

        int[] ans = new int[v];
        int index =0;
        while( !s.isEmpty() ) {
            ans[index++] = s.pop();
        }
        return ans;
    }
}

//    1 0 