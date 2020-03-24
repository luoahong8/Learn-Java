package day03;

public class Demo11DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("原谅你啦！起来吧！地上怪凉！" + i);
        }
        System.out.println("===============");

        int i = 1; // 1. 初始化语句
        do {
            System.out.println("原谅你啦！起来吧！地上怪凉！" + i); // 3. 循环体
            i++; // 4. 步进语句
        } while (i <= 10); // 2. 条件判断
    }
}
