package JavaStudy;

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

public class ExerciseTree {
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

    //二叉树的最大深度
    //最大深度 = 1（根节点） + max（左子树的最大深度，右子树的最大深度）
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
//        return 1 + ( leftdepth > rightdepth ? leftdepth : rightdepth );
        return 1 + (Math.max(leftdepth, rightdepth));
    }

    //平衡二叉树：自己的的左右两个子树的高度差的绝对值不超过1 && 左子树是平衡的 &&右子树是平衡的
    public boolean isBalanced(TreeNode root) {
        //这个数为空，也判定是平衡二叉树
        if(root == null) {
            return true;
        }
        //这个二叉树没有子树，只有根节点，它也是平衡二叉树
        if (root.left == null && root.right == null) {
            return true;
        }
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
        //如果左右子树的高度差的绝对值大于1，那么就不是平衡的
        if(leftdepth - rightdepth > 1 || leftdepth - rightdepth < -1 ) {
            return false;
        }
        //运行到这一行为止，他自己肯定是平衡的
        //下面只需要判断  他的左子树是平衡的 && 他的右子树是平衡的
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //对称二叉树
    //需要判定  a和b是不是相等 && a.left 与 b.right是不是相等 && a.right 与 b.left是不是相等
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        //借助isMirror方法进行判定
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        //两者都为空，也判定是对称二叉树
        if(t1 == null && t2 == null) {
            return true;
        }
        if(t1 == null || t2 == null) {
            return false;
        }
        if(t1.val != t2.val) {
            //两个数的根节点都不相同，肯定不是镜像关系
            return false;
        }
        //利用递归进行调用
        return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
    }
}
