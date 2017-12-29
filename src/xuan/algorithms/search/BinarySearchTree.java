package xuan.algorithms.search;

/**
 * Created by Xuan on 2017/12/28.
 * BST:二叉查找树/二叉排序树
 */
public class BinarySearchTree<Item extends Comparable<Item>> {
    private class Node {
        private Item item;
        private Node left, right;
        private int N;//以该节点为根的子树中的节点总数

        public Node(Item item, int n) {
            this.item = item;
            N = n;
        }
    }

    private Node root;

    //树中有多少个节点
    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.N;
        }
    }

    //树的高度
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

    //树中是否有某元素
    public boolean get(Item item) {
        Node tmp = root;
        while (tmp != null) {
            if (item == tmp.item) {
                return true;
            }
            if (item.compareTo(tmp.item) < 0) {
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }
        return false;
    }

    //往树中添加元素
    public void put(Item item) {
        root=put(root, item);
    }

    private Node put(Node node, Item item) {
        if (node == null) {
            return new Node(item, 1);
        }
        if (item.compareTo(node.item) < 0) {
            node.left = put(node.left, item);
        } else if (item.compareTo(node.item) > 0) {
            node.right = put(node.right, item);
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    //获取树中的最大元素
    public Item getMax() {
        if (root == null) {
            return null;
        }
        return getMax(root);
    }

    private Item getMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.item;
    }

    //获取树中的最小元素
    public Item getMin() {
        if (root == null) {
            return null;
        }
        return getMin(root);
    }

    private Item getMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.item;
    }

    //找到总元素中排在第k位的元素
    public Item select(int k) {
        return select(root, k);
    }

    public Item select(Node node, int k) {
        if (node == null) {
            return null;
        }
        if (node.left.N == (k - 1)) {
            return node.item;
        }
        if (node.left.N > (k - 1)) {
            return select(node.left, k);
        } else {
            return select(node.right, (k - 1 - node.left.N));
        }
    }

    //返回指定元素在总元素中的排名
    public int rank(Item item) {
        Node tmp = root;
        while (tmp != null) {
            if (item == tmp.item) {
                break;
            }
            if (item.compareTo(tmp.item) < 0) {
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }
        return size(tmp.left) + 1;
    }
    public static void main(String[] args) {
        BinarySearchTree<String> bst = new BinarySearchTree<>();
        bst.put("s");
        bst.put("e");
        bst.put("a");
        bst.put("r");
        bst.put("c");
        bst.put("h");
        System.out.println(bst.size());
        System.out.println(bst.height());
        System.out.println(bst.getMax());
        System.out.println(bst.getMin());
        System.out.println(bst.rank("s"));
        System.out.println(bst.select(6));
        System.out.println(bst.select(3));
        System.out.println(bst.get("s"));
        System.out.println(bst.get("h"));
        System.out.println(bst.get("a"));
        System.out.println(bst.get("m"));

    }
}
