package DSAsheetByArsh.StacksAndQueues;

import java.util.*;

    public class lruCache {
        class Node {
            int key;
            int value;
            Node next;
            Node prev;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
                next = prev = null;
            }
        }
        HashMap<Integer, Node> map = new HashMap<>();
        Node head;
        Node tail;
        int capacity;

        public lruCache(int capacity) {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            this.capacity = capacity;
            map = new HashMap<>();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                delete(node);
                insert(node);
                return node.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                node.value = value;
                map.put(key, node);
                delete(node);
                insert(node);
            } else if (map.size() < capacity) {
                Node newNode = new Node(key, value);
                map.put(key, newNode);
                insert(newNode);
            } else {
                Node newNode = new Node(key, value);
                Node toDelete = tail.prev;
                map.remove(toDelete.key);
                delete(toDelete);
                insert(newNode);
                map.put(key, newNode);
            }
        }

        private void delete(Node node) {
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void insert(Node node) {
            Node headNext = head.next;
            head.next = node;
            node.prev = head;
            node.next = headNext;
            headNext.prev = node;
        }
    }
