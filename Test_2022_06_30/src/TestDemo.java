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


}
