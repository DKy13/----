package java_03_29;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class InterviewTree {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            //空树返回一个空的List，（有这个List存在，但里面的元素个数为0）
            //如果return null ,返回的就是空，连这个List都没有
            return result;
        }
        //访问根结点，此次的访问是把元素add到List中
        result.add(root.val);
        //递归遍历左子树，并把左子树的遍历结果全部加到List中
        result.addAll(preorderTraversal(root.left));
        //递归遍历右子树，并把右子树的遍历结果全部加到List中
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            //空树返回一个空的List，（有这个List存在，但里面的元素个数为0）
            //如果return null ,返回的就是空，连这个List都没有
            return result;
        }
        //递归遍历左子树，并把左子树的遍历结果全部加到List中
        result.addAll(inorderTraversal(root.left));
        //访问根结点，此次的访问是把元素add到List中
        result.add(root.val);
        //递归遍历右子树，并把右子树的遍历结果全部加到List中
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    //后序遍历
    public List<Integer>postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            //空树返回一个空的List，（有这个List存在，但里面的元素个数为0）
            //如果return null ,返回的就是空，连这个List都没有
            return result;
        }
        //递归遍历左子树，并把左子树的遍历结果全部加到List中
        result.addAll(postorderTraversal(root.left));
        //递归遍历右子树，并把右子树的遍历结果全部加到List中
        result.addAll(postorderTraversal(root.right));
        //访问根结点，此次的访问是把元素add到List中
        result.add(root.val);
        return result;
    }
    //判定两个二叉树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //第一种情况：p和q均为空，认为相同
        if(p == null && q== null ){
            return true;
        }
        //第二种情况：p和q两个二叉树只有其中一个为空，认为不相同。由于上面的逻辑，所以在此处不会出现两者都为空的情况
        if(p == null || q == null){
            return false;
        }
        //第三种情况：p和q两者都不为空
        if(p.val != q.val){
            //两棵树的根节点都不相同，这两个二叉树肯定不相同
            return false;
        }
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }

    //另一个树的子树
    //判定t是不是s的子树就是看：s是否包含t || s.left是否包含t || s.right是否包含t
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) {
            return false;
        }
        if (s == null && t == null) {
            return true;
        }
        boolean ret = false;
        if(s.val == t.val) {
            //借助上面写的isSameTrue方法来进行判定
            ret =  isSameTree(s,t);//这里不能使用return,使用return程序就直接结束了
        }
        return ret || isSubtree(s.left , t) || isSubtree(s.right , t);
    }
}
