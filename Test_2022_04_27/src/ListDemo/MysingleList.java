package ListDemo;

public class MysingleList {

    //链表(单向，双向，带头，不带头，循环，非循环)
    //节点
    //1.数值域，当前节点的地址
    //2.next域，下一个节点的地址



    static class ListNode{
        //什么时候设计成内部类
        //链表一个个节点这种

        public int value;//数值域
        public ListNode next;//存储下一个节点的地址

        public ListNode(int val){
            this.value = value;
        }
    }

    public ListNode head;//代表单链表的头节点的引用，所以定义在链表外

    public void createList(){
        //这里只是简单的进行链表的构造

        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(23);
        ListNode listNode3 = new ListNode(34);
        ListNode listNode4 = new ListNode(45);
        ListNode listNode5 = new ListNode(56);

        ListNode1.next = ListNode2;

    }





}
