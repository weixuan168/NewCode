package xuan.interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Xuan on 2017/12/20.
 * 2017.12.18 百度面试题：二叉树的广度优先遍历
 */
public class BinaryTree<Item> {

    TreeNode root;

    //如果不写有参的构造器，则系统默认添加无参构造器；但写了有参构造器，就必须显式地写无参构造器
    public BinaryTree() {
    }
    public BinaryTree(Item item) {
        root = new TreeNode(item);
    }

    public TreeNode addNode(TreeNode root, Item item, boolean isLeft) {
        TreeNode node = new TreeNode(item);
        if (isLeft) {
            root.setLeftNode(node);
        } else {
            root.setRightNode(node);
        }
        return node;
    }

    public boolean isEmpty() {
        return root == null;
    }

    //获取整个二叉树的高度
    public int height() {
        return deep(root);
    }

    //获取某一节点的深度
    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            return 1;
        }
        int ld = deep(node.getLeftNode());
        int rd = deep(node.getRightNode());
        int deep = ld > rd ? ld : rd;
        return deep + 1;
    }

    //清空二叉树
    public void clear() {
        delete(root);
    }

    //删除某一节点
    public void delete(TreeNode node) {
        if (node == null) {
            return;
        }
        delete(node.getLeftNode());
        delete(node.getRightNode());
        node = null;
    }

    //广度优先遍历（层序遍历）
    public void bfs() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.getLeftNode() != null) {
                queue.add(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                queue.add(node.getRightNode());
            }
            System.out.print(node.getItem()+" ");
        }
    }

    //深度优先遍历一：前序遍历(根左右）
    public void preOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        //递归前序遍历
//        System.out.print(node.getItem());
//        preOrderTraverse(node.getLeftNode());
//        preOrderTraverse(node.getRightNode());

        //非递归前序遍历
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            if (node1.getRightNode() != null)
                stack.push(node1.getRightNode());
            if (node1.getLeftNode() != null)
                stack.push(node1.getLeftNode());
            System.out.print(node1.getItem() + " ");
        }
    }

    //深度优先遍历二：中序遍历（左根右）
    public void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.getLeftNode());
        System.out.print(node.getItem()+" ");
        inOrderTraverse(node.getRightNode());
    }

    //深度优先遍历三：后序遍历（左右根）
    public void postOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraverse(node.getLeftNode());
        postOrderTraverse(node.getRightNode());
        System.out.print(node.getItem()+" ");
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>();
        TreeNode l1 = binaryTree.addNode(binaryTree.root, 2, true);
        TreeNode r1 = binaryTree.addNode(binaryTree.root, 3, false);
        TreeNode l2 = binaryTree.addNode(l1, 4, true);
        TreeNode r2 = binaryTree.addNode(l1, 5, false);
        TreeNode r3 = binaryTree.addNode(r1, 6, false);

//        //输出binaryTree的高度
//        System.out.println(binaryTree.height());
//
//        //输出binaryTree1的高度
//        System.out.println(binaryTree1.height());

        //广度优先遍历输出binaryTree
        binaryTree.bfs();
        System.out.println();

        //前序遍历输出binaryTree
        binaryTree.preOrderTraverse(binaryTree.root);
        System.out.println();

        //中序遍历输出binaryTree
        binaryTree.inOrderTraverse(binaryTree.root);
        System.out.println();

        //后序遍历输出binaryTree
        binaryTree.postOrderTraverse(binaryTree.root);
        System.out.println();

//        //删除根节点的左子节点
//        binaryTree.delete(r3);
//        System.out.println(binaryTree.height());
//        binaryTree.bfs();
//        System.out.println();
//
//        //删除根节点的右子节点
//        binaryTree.delete(r1);
//        System.out.println(binaryTree.height());
    }
}
