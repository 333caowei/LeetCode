/**
 * Created by caowei on 16/5/15.
 */
public class Solution226 {

    public static void main(String[] args) {
        Solution226 solution226 = new Solution226();

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

        solution226.printTree(treeNode0);
        System.out.println("");
        TreeNode treeNodeResult = solution226.invertTree(treeNode0);
        solution226.printTree(treeNodeResult);
    }


    /**
     * 递归实现,交换当前节点的左右节点,
     * 然后继续递归
     */
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }


        if(root.left!=null && root.right!=null){
            TreeNode temp  = root.left;
            root.left  = root.right;
            root.right = temp;
        }
        else if(root.left==null && root.right!=null){
            root.left  = root.right;
            root.right =null;

        }
        else if(root.left!=null && root.right==null){
            root.right  = root.left;
            root.left =null;
        }

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


    /**
     * 先序遍历打印二叉树
     */
    public void printTree(TreeNode root) {
        if(root==null){
            System.out.print("*");
            return;
        }

        System.out.print(root.val);
        printTree(root.left);
        printTree(root.right);


    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


