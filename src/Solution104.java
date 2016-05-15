/**
 * Created by caowei on 16/5/15.
 */
public class Solution104 {


    public static void main(String[] args) {
        Solution104 solution104 = new Solution104();

        TreeNode treeNode0 = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(1);

        treeNode0.left  = treeNode1;
        treeNode0.right = treeNode2;
        treeNode2.left  = treeNode3;
        treeNode2.right = treeNode4;

        int depth = solution104.maxDepth(treeNode0);
        System.out.print(depth);
    }


    /**
     * 我的做法,用递归实现,但是线上提交显示超时.
     * 应该修改为注释的样子,用left,right保存
     */
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }


        if(1+maxDepth(root.left) > 1+maxDepth(root.right)){
            return  1+maxDepth(root.left);
        }else{
            return  1+maxDepth(root.right);
        }

//        int left = 1+maxDepth(root.left);
//        int right= 1+maxDepth(root.right);
//        if(left > right){
//            return  left;
//        }else{
//            return  right;
//        }


    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

}




