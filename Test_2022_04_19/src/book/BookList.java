package book;

public class BookList {

    private Book[] books = new Book[10];//这个书架的大小

    private int usedSize;//数组中放了几本书

    public BookList() {

        books[0] = new Book("三国演义","罗贯中",90,"小说");
        books[1] = new Book("西游记","吴承恩",78,"小说");
        books[2] = new Book("红楼梦","曹雪芹",89,"小说");
        this.usedSize = 3;
    }

    //获取当前数组当中的元素个数
    public int getUsedSize() {
        return usedSize;
    }

    //修改当前数组中元素的个数
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //可以在这里面 写所有对数组的操作，借书、还书等等
}
