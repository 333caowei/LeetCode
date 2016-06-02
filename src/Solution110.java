import java.util.Map;

/**
 * Created by caowei on 16/6/2.
 */
public class Solution110 {

    public static void main(String args[]){
        Solution110 solution110 = new Solution110();

        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode0.left  = treeNode1;
        treeNode0.right = treeNode2;
        treeNode1.left  = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left  = treeNode5;
        treeNode3.left  = treeNode6;


//        TreeNode treeNode0 = new TreeNode(0);
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        TreeNode treeNode6 = new TreeNode(6);
//
//        treeNode0.left  = treeNode1;
//        treeNode0.right = treeNode2;
//        treeNode1.left  = treeNode3;
//        treeNode2.right = treeNode4;
//        treeNode3.left  = treeNode5;
//        treeNode4.right = treeNode6;



//        TreeNode treeNode0 = new TreeNode(0);
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        TreeNode treeNode6 = new TreeNode(6);
//
//        treeNode0.left  = treeNode1;
//        treeNode0.right = treeNode2;
//        treeNode1.left  = treeNode3;
//        treeNode1.right = treeNode4;
//        treeNode3.left  = treeNode5;
//        treeNode3.right = treeNode6;


        boolean isBalanced = solution110.isBalanced(treeNode0);
        System.out.print(isBalanced);
    }


    /**
     * 这里是自己的实现,并不是很友好,看网站参考
     * http://blog.csdn.net/feliciafay/article/details/18348065
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        int n = height(root);
        if(n!=10000){
            return true;
        }else{
            return false;
        }
    }

    public int height(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left  =  1+height(root.left);
        int right =  1+height(root.right);
        if(left>=10000 || right>=10000){
            return 10000;
        }

        if(Math.abs(left-right)<=1){
            return Math.max(left, right);
        }else{
            return 10000;
        }
    }








    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
