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
