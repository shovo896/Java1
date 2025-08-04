import java.util.HashMap;

public class LRUCacheDemo {

    static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class LRUCache {
        private final int capacity;
        private HashMap<Integer, Node> map;
        private Node head, tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();

            // Dummy head and tail nodes
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            }

            Node node = map.get(key);
            remove(node);           // Remove from current position
            insertToFront(node);    // Move to front

            return node.value;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                remove(map.get(key));
            }

            if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
            }

            Node newNode = new Node(key, value);
            insertToFront(newNode);
        }

        private void remove(Node node) {
            map.remove(node.key);

            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insertToFront(Node node) {
            map.put(node.key, node);

            node.next = head.next;
            node.prev = head;

            head.next.prev = node;
            head.next = node;
        }

        // Optional: Debugging helper
        public void printCache() {
            Node current = head.next;
            while (current != tail) {
                System.out.print("[" + current.key + ":" + current.value + "] ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));   // Output: 1

        cache.put(3, 3);                    // Evicts key 2
        System.out.println(cache.get(2));   // Output: -1

        cache.put(4, 4);                    // Evicts key 1
        System.out.println(cache.get(1));   // Output: -1
        System.out.println(cache.get(3));   // Output: 3
        System.out.println(cache.get(4));   // Output: 4
    }
}
