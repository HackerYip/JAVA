public class Test {

    public static void main(String[] args) {
        String str = "hello";
        str += "world";//会产生一个StringBuilder的对象
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("world");//会产生很多临时对象
        str = sb.toString();
        System.out.println(str);//全新的对象
    }
}
