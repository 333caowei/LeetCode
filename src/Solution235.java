/**
 * Created by caowei on 16/5/22.
 */
public class Solution235 {

    public static void main(String args[]){
        Solution235 solution235 = new Solution235();

        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode6.left  = treeNode2;
        treeNode6.right = treeNode8;
        treeNode2.left  = treeNode0;
        treeNode2.right = treeNode4;
        treeNode8.left  = treeNode7;
        treeNode8.right = treeNode9;
        treeNode4.left  = treeNode3;
        treeNode4.right = treeNode5;

        TreeNode lowestCommonAncestor = solution235.lowestCommonAncestor(treeNode6, treeNode7, treeNode9);
        System.out.print(lowestCommonAncestor.val);
    }


    /**
     *使用递归方法来查找
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        else if(root.val==p.val){
            return p;
        }else if(root.val==q.val){
            return q;
        }

        TreeNode left  = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left ==null && right!=null){
            return right;
        }else if(left !=null && right==null){
            return left;
        }
        else if(left ==null && right==null){
            return null;
        }else{
            return root;        //返回目标节点
        }




    }





    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
