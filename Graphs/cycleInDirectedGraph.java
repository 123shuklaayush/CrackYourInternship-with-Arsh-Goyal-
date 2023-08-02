package DSAsheetByArsh.Graphs;

import java.util.ArrayList;

public class cycleInDirectedGraph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] vis = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i = 0; i< V; i++){
            if(!vis[i]){
                if(dfs(adj, i, vis, recStack)) return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> arr, int vertex, boolean[] vis, boolean[] recStack){
        vis[vertex] = true;
        recStack[vertex] = true;

        for(Integer it : arr.get(vertex)){
            if(!vis[it]){
                if(dfs(arr, it, vis, recStack)) return true;
            }

            else if(recStack[it]) return true;
        }
        recStack[vertex] = false;
        return false;
    }
}
