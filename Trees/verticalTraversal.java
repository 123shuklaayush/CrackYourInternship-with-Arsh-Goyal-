package DSAsheetByArsh.Trees;
import java.util.*;

public class verticalTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    static ArrayList<ArrayList<Integer>> verticalOrderPrint(Node root) {
        Map<Integer, ArrayList<Integer>> nodes = new TreeMap<>();
        Queue<Pair<Node, Integer>> queue = new ArrayDeque<>();

        if (root == null)
            return new ArrayList<>();

        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<Node, Integer> pair = queue.poll();
            Node node = pair.getKey();
            int hd = pair.getValue();

            if (!nodes.containsKey(hd)) {
                nodes.put(hd, new ArrayList<>());
            }

            nodes.get(hd).add(node.data);

            if (node.left != null)
                queue.add(new Pair<>(node.left, hd - 1));

            if (node.right != null)
                queue.add(new Pair<>(node.right, hd + 1));
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int hd : nodes.keySet()) {
            Collections.sort(nodes.get(hd));
            result.add(nodes.get(hd));
        }

        return result;
    }


    public static void main(String[] args) {
        // Construct the tree
        Node root = new Node();
        root.data = 3;
        root.left = new Node();
        root.left.data = 9;
        root.right = new Node();
        root.right.data = 20;
        root.right.left = new Node();
        root.right.left.data = 15;
        root.right.right = new Node();
        root.right.right.data = 7;

        // Call the verticalOrder method
        ArrayList<ArrayList<Integer>> result = verticalOrderPrint(root);

        // Print the result
        System.out.println("Vertical Traversal:");
        System.out.println(result);
    }
}
