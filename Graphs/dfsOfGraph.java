package DSAsheetByArsh.Graphs;

import java.util.ArrayList;

public class dfsOfGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] vis = new boolean[V];
        dfs(0, adj, vis, arr);
        return arr;
    }

    public void dfs(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> arr){
        vis[vertex] = true;
        arr.add(vertex);

        for(int neighbour: adj.get(vertex)){
            if(!vis[neighbour])
                dfs(neighbour, adj, vis, arr);
        }
    }
}
