import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by caowei on 16/6/6.
 */
public class Solution107 {

    public static void main(String args[]){
        Solution107 solution107 = new Solution107();

        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode20 = new TreeNode(20);
        TreeNode treeNode15 = new TreeNode(15);
        TreeNode treeNode7 = new TreeNode(7);

        treeNode3.left  = treeNode9;
        treeNode3.right = treeNode20;
        treeNode20.left = treeNode15;
        treeNode20.right= treeNode7;



        List<List<Integer>> levelOrderBottom = solution107.levelOrderBottom(treeNode3);
        System.out.print(levelOrderBottom.toString());
    }


    /**
     * 没做出来,以下是看了参考以后的做法 
     * @param root
     * @return
     */

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new LinkedList<List<Integer>>();
        }

        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size()!=0){
            Queue<TreeNode> tempqueue = new LinkedList<TreeNode>();
            List<Integer> layerList = new LinkedList<Integer>();
            while(queue.size()!=0){
                TreeNode currentNode = queue.poll();
                if(currentNode.left!=null){
                    tempqueue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    tempqueue.add(currentNode.right);
                }
                layerList.add(currentNode.val);
            }
            stack.push(layerList);
            queue = tempqueue;

        }




        //reverse
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        int length = stack.size();
        for(int i=0;i<length;i++){
            list.add(stack.pop());
        }
        return list;
    }



    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
