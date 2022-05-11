public class My {
    class MyCircularQueue {

        /**
         * 构造方法
         * @param k K个大小
         */
        public MyCircularQueue(int k) {

        }

        /**
         * 入队
         * @param value
         * @return
         *//**
         * 入队
         * 1、判断是不是满的？
         * 2、把当前需要存放的元素放到rear下标的地方。
         * @param value
         * @return
         */
        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }

        }

        /**
         * 出队
         * @return
         */
        public boolean deQueue() {
            return false;
        }

        /**
         * 得到队头元素
         * @return
         */
        public int Front() {
            return -1;
        }

        /**
         * 得到队尾元素
         * @return
         */
        public int Rear() {
            return -1;
        }

        /**
         * 当前循环队列是否为空
         * @return
         */
        public boolean isEmpty() {
            if((rear + 1) % size = front){
                return false;
            }
            else{
                return
            }
        }

        /**
         * 判断当前队列是否为满
         * @return
         */
        public boolean isFull() {
            return false;
        }
    }
}
