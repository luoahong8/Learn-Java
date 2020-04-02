package day04;

public class Demo04MethodNotice {
    public static int method1() {
        return 10;
    }

    public static void method2() {
        //return 10; // 错误的写法！方法没有返回值，return后面就不能写返回值。
        return; // 没有返回值，只是结束方法的执行而已。
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
    //return; // 最后一行的return可以省略不写。
    }

    public static int getMax(int a, int b) {
        /*int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;*/

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
