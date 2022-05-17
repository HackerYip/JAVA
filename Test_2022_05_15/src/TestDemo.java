public class TestDemo {

    public static void main(String[] args) {
        Message<Integer> message = new Message<>();
        message.setMessage(1);
        fun(message);
    }

    public static void fun(Message<?> temp){
        //temp.setMessage(1);


    }
}
