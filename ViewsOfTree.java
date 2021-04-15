public class ViewsOfTree {
    static class Node
    {
        Node left ;
        Node right ;
        int data;
    }

    static Node createTree(int data)
    {
        Node newNode= new Node();
        newNode.data= data;
        newNode.left=newNode.right=null;
        return newNode;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node tree = createTree(5);
        tree.left = createTree(3);
        tree.right = createTree(6);
        tree.left.left = createTree(2);
        tree.left.right = createTree(4);

    }

}
