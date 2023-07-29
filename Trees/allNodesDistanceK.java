package DSAsheetByArsh.Trees;
import java.util.*;
public class allNodesDistanceK {
    public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track, TreeNode target){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left != null){
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }
            if(current.right != null){
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parent_track = new HashMap<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        markParents(root, parent_track, target);
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        queue.offer(target);
        visited.put(target,true);
        int curr_level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            if(curr_level == k) break;
            curr_level++;
            for(int i = 0; i< size; i++){
                TreeNode current = queue.poll();
                if(current.left != null && visited.get(current.left) == null){
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                if(current.right != null && visited.get(current.right) == null){
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                if(parent_track.get(current) != null && visited.get(parent_track.get(current)) == null){
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            res.add(curr.val);
        }
        return res;
    }
    public static void main(String[] args) {

        // Create the binary tree from the given root values
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Define the target node and distance K
        TreeNode targetNode = root.left; // Target node with value 5
        int k = 2;

        // Call the distanceK method to get the result
        List<Integer> result = distanceK(root, targetNode, k);

        // Print the result
        System.out.println("Nodes at distance " + k + " from the target node are: " + result);
    }
}
