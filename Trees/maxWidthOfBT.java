package DSAsheetByArsh.Trees;
import java.util.*;
public class maxWidthOfBT {
    public static class Pair<A, B> {
        private A key;
        private B value;

        public Pair(A key, B value) {
            this.key = key;
            this.value = value;
        }

        public A getKey() {
            return key;
        }

        public B getValue() {
            return value;
        }
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            int levelStart = queue.peek().getValue();
            int index = 0;
            int i = 0;

            while (i < levelLength) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                index = pair.getValue();

                if (node.left != null) {
                    queue.add(new Pair<>(node.left, 2 * index));
                }

                if (node.right != null) {
                    queue.add(new Pair<>(node.right, 2 * index + 1));
                }
                i++;
            }
            maxWidth = Math.max(maxWidth, index - levelStart + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        // Creating the binary tree from the input array [1, 3, 2, 5, 3, null, 9]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        // Calculate and print the maximum width of the binary tree
        int maxWidth = widthOfBinaryTree(root);
        System.out.println("Maximum Width of Binary Tree: " + maxWidth);
    }
}
