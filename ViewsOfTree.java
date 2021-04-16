import java.util.LinkedList;
import java.util.Queue;

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
                if (i == 1)
                    System.out.print(temp.data+" ");

                if(temp.left!=null)
                    queue.add(temp.left);

                if(temp.right!=null)
                    queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node tree = createTree(5);
        tree.left = createTree(3);
        tree.right = createTree(6);
        tree.left.left = createTree(2);
        tree.left.right = createTree(4);

        leftView(tree);

    }

}
