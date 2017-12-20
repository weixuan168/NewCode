package xuan.interview;

/**
 * Created by Xuan on 2017/12/20.
 */
public class TreeNode<Item> {
    private Item item;
    private TreeNode leftNode;
    private TreeNode rightNode;

    TreeNode() {

    }
    TreeNode(Item item) {
        this.item = item;
    }
    public Item getItem() {
        return item;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

}
