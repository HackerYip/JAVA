import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestDemo3 {

    public static void main6(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0, 1);
        arrayList.add(1, 2);
        arrayList.add(2, 199);
        arrayList.add(3, 299);
        arrayList.add(4, 399);
        System.out.println(arrayList);
        System.out.println("===============");

        for(int i = 0; i < arrayList.size(); ++i) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();
        System.out.println("===============");
        Iterator it = arrayList.iterator();

        while(it.hasNext()) {
            Integer x = (Integer)it.next();
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("======使用迭代器=========");
        it = arrayList.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("======使用迭代器2=========");
        ListIterator it2 = arrayList.listIterator();

        while(it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }

        System.out.println();
    }

    public static void main5(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0, 1);
        arrayList.add(1, 2);
        arrayList.add(2, 99);
        System.out.println(arrayList);
        int index = arrayList.lastIndexOf(new Integer(99));
        System.out.println(index);
    }


    public static void main1(String[] args) {
        MyArraylist myArraylist = new MyArraylist();
        System.out.println("========================");
        int ret = myArraylist.get(2);
        System.out.println(ret);
    }
}


