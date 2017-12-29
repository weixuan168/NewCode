package xuan.algorithms.search;

/**
 * Created by Xuan on 2017/12/28.
 * 红黑二叉排序树
 */
public class RedBlackBST<Item extends Comparable<Item>> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node root;

    private class Node {
        boolean color;
        Item item;
        Node left, right;
        int N;

        Node(Item item, int n, boolean color) {
            this.item = item;
            N = n;
            this.color = color;
        }
    }

    private boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }

    private int size() {
        return size(root);
    }
    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.N;
    }

    private Node rotateLeft(Node node) {
        Node tmp = node.right;
        node.right = tmp.left;
        tmp.left = node;
        tmp.color = node.color;
        node.color = RED;
        tmp.N = node.N;
        node.N = size(node.left) + size(node.right) + 1;
        return tmp;
    }

    private Node rotateRight(Node node) {
        Node tmp = node.left;
        node.left = tmp.right;
        tmp.right = node;
        tmp.color = node.color;
        node.color = RED;
        tmp.N = node.N;
        node.N = size(node.left) + size(node.right) + 1;
        return tmp;
    }

    private void flipColor(Node node) {
        node.left.color = BLACK;
        node.right.color = BLACK;
        node.color = RED;
    }

    public void put(Item item) {
        root = put(root, item);
    }

    public Node put(Node node, Item item) {
        if (node == null) {
            return new Node(item, 1, RED);
        }
        if (item.compareTo(node.item) < 0) {
            node.left = put(node.left, item);
        } else if (item.compareTo(node.item) > 0) {
            node.right = put(node.right, item);
        }
        if (isRed(node.right) && !isRed(node.left)) {
            node=rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
           node=rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColor(node);
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight + 1;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        RedBlackBST<Integer> redBlackBST = new RedBlackBST<>();
        int[] a = {1, 2, 3, 4, 5, 6,};
        for (int i : a) {
            bst.put(i);
            redBlackBST.put(i);
        }
        System.out.println(bst.height());
        System.out.println(redBlackBST.height());

    }
}
