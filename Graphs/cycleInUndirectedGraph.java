package DSAsheetByArsh.Graphs;
import java.util.*;

public class cycleInUndirectedGraph {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for(int i = 0; i< V; i++){
            if(!vis[i]){
                if(checkForCycle(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkForCycle(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> arr){
        vis[node] = true;

        for(int it: arr.get(node)){
            if(vis[it] && it != parent){
                return true;
            }
            else if(!vis[it]){
                if(checkForCycle(node, parent, vis, arr)) return true;
            }
        }
        return false;
    }
}
