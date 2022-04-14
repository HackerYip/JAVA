public class MyDate {

    public int year;
    public int month;
    public int day;


    //设置日期

    public void setDate(MyDate this,int year,int month,int day){
        this.year = year;//用this区分这个被赋值的这个year不是形参的year
        this.month = month;//加上this就是当前对象的month，当前是哪个对象？谁调用setDate，当前对象就是谁
        this.day = day;
    }

    public void printDate(MyDate this){
        System.out.println("年 "+ year + "月 "+ month + "日 "+day);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setDate(2022,3,25);
        myDate.printDate();
    }


}
