package DSAsheetByArsh.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class bfsOfgraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        boolean[] vis = new boolean[V];
        vis[0] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            arr.add(curr);

            for(int neighbour: adj.get(curr)){
                if(!vis[neighbour]){
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return arr;
    }
}
