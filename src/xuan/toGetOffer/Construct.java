package xuan.toGetOffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xuanwei on 2018/4/12.
 *
 * 输入某二叉树的前序遍历和中序遍历的结果（假设其中不含有重复数字），请重建出该二叉树。
 */
public class Construct {

    class TreeNode {
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int value) {
            this.value = value;
        }
    }

    private int findIndex(int key, int[] inorder) {
        for(int i=0;i<inorder.length;i++) {
            if (key == inorder[i]) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode reConstructBinaryTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        if (preorder.length != inorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = findIndex(preorder[0], inorder);
        if (index == -1) {
            return null;
        }
        //Arrays.copyOfRange(int[] a,int from,int to),包括左边界，不包括右边界。
        root.leftNode = reConstructBinaryTree(Arrays.copyOfRange(preorder, 1, index+1),
                Arrays.copyOfRange(inorder, 0, index));
        root.rightNode = reConstructBinaryTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return root;
    }

    //广度优先遍历（层序遍历）
    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.leftNode != null) {
                queue.add(node.leftNode);
            }
            if (node.rightNode!= null) {
                queue.add(node.rightNode);
            }
            System.out.print(node.value+" ");
        }
    }
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        Construct construct = new Construct();
        TreeNode root=construct.reConstructBinaryTree(preorder, inorder);
        construct.bfs(root);
    }
}
