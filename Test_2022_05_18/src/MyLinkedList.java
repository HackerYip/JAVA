public class MyLinkedList {

    /**
     * @Author 12629
     * @Description：
     */

        class Node {
            public int val;
            public Node next;
            public Node(int val) {
                this.val = val;
            }
        }

    public Node head;
    public Node last;
    public int usedSize;

    /**
     * 入队
     * @param val
     */
    public void offer(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
        this.usedSize++;
    }

    /**
     * 出队
     * @return
     */
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int val = head.val;
        head = head.next;
        //处理只有1个节点的情况下
        if(head == null) {
            last = null;
        }
        usedSize--;
        return val;
    }
    /**
     * 出队 但是不删除
     * @return
     */
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return head.val;
    }
    public int size() {
        return usedSize;
    }
    public boolean isEmpty() {
        return usedSize == 0;
    }

}
