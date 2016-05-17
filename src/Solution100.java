/**
 * Created by caowei on 16/5/17.
 */
public class Solution100 {

    public static void main(String args[]){
        Solution100 solution100 = new Solution100();

        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode0.left  = treeNode1;
        treeNode0.right = treeNode2;
        treeNode2.left  = treeNode3;
        treeNode2.right = treeNode4;
        treeNode1.right = treeNode5;

        boolean isSame = solution100.isSameTree(treeNode0, treeNode0);
        System.out.print(isSame);
    }


    /**
     * 同时递归来做,同时传入相同位置的节点比较是否相等
     *
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p!=null && q!=null && p.val==q.val){
            boolean left  = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            if(left==right && left==true){
                return  true;
            }else{
                return false;
            }
        }

        return false;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
