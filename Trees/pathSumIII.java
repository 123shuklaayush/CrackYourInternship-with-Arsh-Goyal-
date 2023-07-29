package DSAsheetByArsh.Trees;
import java.util.*;
public class pathSumIII {
    long total = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);
        helper(root, targetSum, 0, map);
        return (int) total;
    }
    void helper(TreeNode root, long tar, long curr, HashMap<Long, Long> map){
        if(root == null) return;

        curr += root.val;
        if(map.containsKey(curr-tar))
            total += map.get(curr-tar);

        map.put((long) curr, map.getOrDefault(curr, 0L)+1);
        helper(root.left, tar, curr, map);
        helper(root.right, tar, curr, map);

        map.put((long) curr, map.get(curr) -1);
    }
}
