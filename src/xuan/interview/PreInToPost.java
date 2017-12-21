package xuan.interview;

/**
 * Created by Xuan on 2017/12/21.
 * 已知字符串的前序遍历和中序遍历，求输出其后序遍历结果
 */
public class PreInToPost {
    class TreeNode {
        char data;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(char c) {
            data = c;
            leftNode = null;
            rightNode = null;
        }
    }
    public TreeNode constructTree(String preOrder, String inOrder) {
        if (preOrder.length() == 0) {
            return null;
        }
        if (preOrder.length() == 1) {
            return new TreeNode(preOrder.charAt(0));
        }
        char c = preOrder.charAt(0);
        int pos = inOrder.indexOf(c);
        String inLeftTree = inOrder.substring(0, pos);
        String inRightTree = inOrder.substring(pos + 1);
        String preLeftTree = preOrder.substring(1, 1 + inLeftTree.length());
        String preRightTree = preOrder.substring(1 + inLeftTree.length());
        TreeNode root = new TreeNode(c);
        root.leftNode = constructTree(preLeftTree, inLeftTree);
        root.rightNode = constructTree(preRightTree, inRightTree);
        return root;
    }

    public void postOderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        postOderTraverse(node.leftNode);
        postOderTraverse(node.rightNode);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        String preOrder = "124536";
        String inOrder = "425136";
        PreInToPost p = new PreInToPost();
        TreeNode root = p.constructTree(preOrder, inOrder);
        p.postOderTraverse(root);

    }
}
