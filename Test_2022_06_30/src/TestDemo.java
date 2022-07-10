public class TestDemo {
    class A {

    }

    class B extends A {

    }

    class C extends B {

    }


    public class Test {

        public static void testQuickSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.quickSort(array);
            long endTime = System.currentTimeMillis();



            System.out.println("快速排序：" + (endTime - startTime));
        }


        public static void testShellSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.shellSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("希尔排序：" + (endTime - startTime));
        }



        public static void testInsertSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.insertSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("插入排序：" + (endTime - startTime));

        }




        public static void testSelectSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.selectSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("选择排序：" + (endTime - startTime));
        }
        public static void testHeapSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.heapSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("堆排序：" + (endTime - startTime));



        }
        public static void testBubbleSort(int[] array) {
            array = Arrays.copyOf(array, array.length);
            long startTime = System.currentTimeMillis();
            TestSort.bubbleSort2(array);
            long endTime = System.currentTimeMillis();

            System.out.println("冒泡排序：" + (endTime - startTime));
        }
    }
}
