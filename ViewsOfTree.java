import java.util.*;

public class ViewsOfTree {
    static class Node {
        Node left;
        Node right;
        int data;
    }

    static Node createTree(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }
// time complexity O(n) , space complexity O(n)

    static void leftView(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
                // i ==1 to print the leftmost element
                if (i == 1)
                    System.out.print(temp.data + " ");

                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }

    static void rightView(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // i ==n to print the rightmost element
                if (i == n)
                    System.out.print(temp.data + " ");

                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }

// time complexity : O(n) space complexity :
    static void topView(Node root) {
        class QueueObj {
            Node node;
            int hd;

            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> queue = new LinkedList<QueueObj>();
        TreeMap<Integer, Node> map = new TreeMap<>();

        if (root == null)
            return;

        queue.add(new QueueObj(root, 0));

        while (!queue.isEmpty()) {
            QueueObj temp = queue.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node);
            }
            if (temp.node.left != null) {
                queue.add(new QueueObj(temp.node.left, temp.hd - 1));
            }
            if (temp.node.right != null) {
                queue.add(new QueueObj(temp.node.right, temp.hd + 1));
            }
        }
        for (Map.Entry<Integer, Node> res : map.entrySet()) {
            System.out.print(res.getValue().data + " ");
        }

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node tree = createTree(5);
        tree.left = createTree(3);
        tree.right = createTree(6);
        tree.left.left = createTree(2);
        tree.left.right = createTree(4);
        tree.right.left = createTree(7);
        tree.right.left.right = createTree(9);

        leftView(tree);
        System.out.println();
        rightView(tree);
        System.out.println();
        topView(tree);

    }

}
