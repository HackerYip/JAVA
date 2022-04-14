public class MyDate {

    public int year;
    public int month;
    public int day;


    //设置日期

    public void setDate(int myYear,int myMonth,int myDay){
        year = myYear;
        month = myMonth;
        day = myDay;
    }

    public void printDate(){
        System.out.println("年 "+ year + "月 "+ month + "日 "+day);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setDate(2022,3,25);
        myDate.printDate();
    }


}
