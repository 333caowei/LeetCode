import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by caowei on 16/6/7.
 */
public class Solution101 {

    public static void main(String args[]) {
        Solution101 solution101 = new Solution101();

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2_1 = new TreeNode(2);
        TreeNode treeNode2_2 = new TreeNode(2);
        TreeNode treeNode3_1 = new TreeNode(3);
        TreeNode treeNode3_2 = new TreeNode(4);
        TreeNode treeNode3_3 = new TreeNode(4);
        TreeNode treeNode3_4 = new TreeNode(3);

        treeNode1.left    = treeNode2_1;
        treeNode1.right   = treeNode2_2;
        treeNode2_1.left  = treeNode3_1;
        treeNode2_1.right = treeNode3_2;
        treeNode2_2.left  = treeNode3_3;
//        treeNode2_2.right  = treeNode3_4;


        boolean isSymmetric = solution101.isSymmetric(treeNode1);
        System.out.print(isSymmetric);
    }



    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean isSymmetric = true;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size()!=0){
            Queue<TreeNode> tmpQueue = new LinkedList<TreeNode>();
            ArrayList<Integer> eachLevel = new ArrayList<Integer>();
            while (queue.size()!=0){
                TreeNode currentNode = queue.poll();
                eachLevel.add(currentNode.val);
                if(currentNode.val==-1000){
                    continue;
                }
                if(currentNode.left!=null){
                    tmpQueue.add(currentNode.left);
                }else{
                    tmpQueue.add(new TreeNode(-1000));
                }
                if(currentNode.right!=null){
                    tmpQueue.add(currentNode.right);
                }else{
                    tmpQueue.add(new TreeNode(-1000));
                }
            }
            isSymmetric = judge(eachLevel);
            if(isSymmetric==false){
                break;
            }
            queue = tmpQueue;
        }

        return isSymmetric;
    }

    public boolean judge(ArrayList<Integer> arrayList){
        boolean isSymmetric = true;
        for(int i=0, j=arrayList.size()-1; i<=j; i++, j--){
            int x = arrayList.get(i);
            int y = arrayList.get(j);
            if(x!=y){
                isSymmetric=false;
                break;
            }
        }

        return isSymmetric;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
