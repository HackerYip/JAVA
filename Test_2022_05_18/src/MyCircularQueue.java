public class MyCircularQueue {

        private int[] elem;
        private int front;//表示队头下标
        private int rear;//表示队尾下标
        /**
         * 构造方法
         * @param k K个大小
         */
        public MyCircularQueue(int k) {
            elem = new int[k];
        }

        /**
         * 入队
         * 1、判断是不是满的？
         * 2、把当前需要存放的元素放到rear下标的地方。
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if(isFull()) {
                return false;
            }
            this.elem[rear] = value;
            //注意这里 不要出错！
            rear = (rear+1) % elem.length;
            return true;
        }

        /**
         * 出队
         * @return
         */
        public boolean deQueue() {
            if(isEmpty()) {
                return false;
            }
            front = (front+1) % elem.length;
            return true;
        }

        /**
         * 得到队头元素
         * @return
         */
        public int Front() {
            if(isEmpty()) {
                return -1;
            }
            return elem[front];
        }

        /**
         * 得到队尾元素
         * @return
         */
        public int Rear() {
            if(isEmpty()) {
                return -1;
            }
            int index = (rear == 0) ? (elem.length-1) : (rear-1);
            return elem[index];
        }


        //ex

        /**
         * 当前循环队列是否为空
         * @return
         */
        public boolean isEmpty() {
            return rear == front;
        }
    /**
     * 判断当前队列是否为满
     * 浪费一个空间来表示满
     * @return
     */
    public boolean isFull() {
        if( (rear+1)%elem.length == front ) {
            return true;
        }
        return false;
    }

}
