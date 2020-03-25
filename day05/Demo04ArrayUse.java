package day05;

public class Demo04ArrayUse {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = { 10, 20, 30 };

        System.out.println(array); // [I@75412c2f

        // 直接打印数组当中的元素
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        System.out.println("=============");

        // 也可以将数组当中的某一个单个元素，赋值交给变量
        int num = array[1];
        System.out.println(num); // 20
    }
}
