// time complexity O(n)

public class Mirrorify {
    static class Node
    {
        Node left ;
        Node right ;
        int data;
    }

    static void inOrder(Node root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static Node createTree(int data)
    {
        Node newNode= new Node();
        newNode.data= data;
        newNode.left=newNode.right=null;
        return newNode;
    }
//create a new tree
    static Node mirrorify(Node root)
    {
        if(root==null)
            return null;

        Node newNode = createTree(root.data);
        newNode.left= mirrorify(root.right);
        newNode.right= mirrorify(root.left);
        return newNode;
    }
    // change the same tree to the mirror tree

    static Node mirrorUtil(Node root)
    {
        if(root==null)
        return null;

        Node temp = root.left;
        root.left= root.right;
        root.right= temp;

        if(root.left !=null)
        {
            mirrorUtil(root.left);
        }

        if(root.right !=null)
        {
            mirrorUtil(root.right);
        }
        return root;
    }

    public static void main(String str[])
    {
        Node tree = createTree(5);
        tree.left = createTree(3);
        tree.right = createTree(6);
        tree.left.left = createTree(2);
        tree.left.right = createTree(4);

        inOrder(tree);
        Node mirror = mirrorify(tree);
        System.out.println();
        inOrder(mirror);
        System.out.println();
        Node mirrorNew=  mirrorify(tree);
        inOrder(mirrorNew);
    }

}
