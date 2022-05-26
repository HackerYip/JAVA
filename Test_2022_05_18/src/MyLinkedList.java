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
    class MyStack {


        private Queue<Integer> qu1;
        private Queue<Integer> qu2;

        public MyStack() {
            qu1 = new LinkedList<>();
            qu2 = new LinkedList<>();
        }

        /**
         入到不为空的队列当中
         如果都为空 放到qu1当中
         */
        public void push(int x) {
            if(!qu1.isEmpty()) {
                qu1.offer(x);
            }else if(!qu2.isEmpty()) {
                qu2.offer(x);
            }else{
                qu1.offer(x);
            }
        }

        public int pop() {
            //1、先要判断 当前 “栈” 是否为空
            if(empty()) {
                return -1;
            }

            if(!qu1.isEmpty()) {
                //出这个不为空的队列，出size-1
                int size = qu1.size();
                for(int i = 0;i < size-1;i++) {
                    // int tmp = qu1.poll();
                    // qu2.offer(tmp);
                    qu2.offer(qu1.poll());
                }
                return qu1.poll();
            } else {
                //出这个不为空的队列，出size-1
                int size = qu2.size();
                for(int i = 0;i < size-1;i++) {
                    qu1.offer(qu2.poll());
                }
                return qu2.poll();
            }
        }


}
