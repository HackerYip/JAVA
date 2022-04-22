public class TestDemo {

    public class Example{
        String str = new String("good");
        char[ ] ch = { 'a' , 'b' , 'c' };
        public static void main(String args[]){
            Example ex = new Example();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str + " and ");
            System.out.print(ex.ch);
        }
        public void change(String str,char ch[ ]){
            str = "test ok";
            ch[0] = 'g';
        }
    }


    public class SystemUtil{
        public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
            System.out.println(isAdmin("Admin"));
        }
    }


}
