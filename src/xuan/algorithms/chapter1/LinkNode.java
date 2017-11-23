package xuan.algorithms.chapter1;

/**
 * Created by Xuan on 2017/7/27.
 */
public class LinkNode {
    private int value;
    private LinkNode nextNode;

    public LinkNode() {

    }

    public LinkNode(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public LinkNode getNextNode() {
        return nextNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(LinkNode nextNode) {
        this.nextNode = nextNode;
    }

    public static int max(LinkNode first) {
        if (first == null) {
            throw new NullPointerException("LinkNode is Null");
        }
        if (first.getNextNode() == null) {
            return first.getValue();
        }
        if (first.getValue() > first.getNextNode().getValue()) {
            first.setNextNode(first.getNextNode().getNextNode());
            return max(first);
        } else {
            return max(first.getNextNode());
        }
    }

    public static int min(LinkNode first) {
        if (first == null) {
            throw new NullPointerException("LinkNode is Null");
        }
        if (first.getNextNode() == null) {
            return first.getValue();
        }
        if (first.getValue() < first.getNextNode().getValue()) {
            first.setNextNode(first.getNextNode().getNextNode());
            return min(first);
        } else {
            return min(first.getNextNode());
        }
    }

    public static void main(String[] args) {
        LinkNode first = new LinkNode(1);
        LinkNode node1 = new LinkNode(3);
        LinkNode node2 = new LinkNode(5);
        LinkNode node3 = new LinkNode(4);
        first.setNextNode(node1);
        node1.setNextNode(node2);
        node2.setNextNode(node3);
        System.out.println(max(first));
        System.out.println(min(first));

    }
}
