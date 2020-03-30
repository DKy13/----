package java_03_29;
class Node{
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}

public class TestTree {
    public static  Node build(){
//手动构造一棵树
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        g.right = h;
        c.right = f;
        return  a;
    }
    //实现先序遍历
    public static void preOrder(Node root){
        if(root == null ){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //实现中序遍历
    public static void inOrder(Node root){
        if(root == null ){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    //实现后序遍历
    public static void postOrder(Node root){
        if(root == null ){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    //求二叉树节点的个数
    public static int size(Node root){
        if(root == null){
            return 0;
        }
        //整个树的节点个数= 根结点的个数 + 左子树节点的的个数 + 右子树节点的个数
        return 1 + size(root.left) + size(root.right);
    }
    //求二叉树叶子节点的个数
    public  static int leafSize(Node root){
        if (root == null) {
            return  0;
        }
        if (root.left == null && root.right == null) {
            //说明此时的root没有子树，root自己既是根节点也是叶子节点
            return 1;
        }
        return leafSize(root.left) + leafSize(root.right);
    }
    //求二叉树第k层节点的个数
    public static int kLevelSize(Node root,int k){
        if (k < 1 || root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        //k层节点的个数 = 左子树的k-1层节点的个数 + 右子树的k-1层节点的个数
        return kLevelSize(root.left,k-1) + kLevelSize(root.right, k-1);
    }

    //在二叉树中查找指定元素
    Node find(Node root,char toFind){
        if(root == null){
            return null;
        }
        if(root.val == toFind){
            return root;
        }
        Node result = find(root.left,toFind);
        if(result != null){
            return result;
        }
        return find(root.right,toFind);
    }
    public static void main(String[] args) {
        Node root = build();
        System.out.println("先序遍历：");
        preOrder(root);
        System.out.println();

        System.out.println("中序遍历：");
        inOrder(root);
        System.out.println();

        System.out.println("后序遍历：");
        postOrder(root);
        System.out.println();

        System.out.println("这个二叉树的节点个数是：" + size(root) );

        System.out.println("这个二叉树的叶子节点的个数：" + leafSize(root) );

        System.out.println("这个二叉树的第三层节点的个数是：" + kLevelSize(root,3));

    }
}




































